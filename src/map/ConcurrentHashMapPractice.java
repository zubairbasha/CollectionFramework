package map;

import java.util.HashMap;

public class ConcurrentHashMapPractice {
	public static void main(String[] args) {
		HashMap<String, Integer> concurrentMap = new HashMap<>();
		// Creating and starting multiple threads to add integers to the map
		Runnable addIntegers = () -> {
			for (int i = 0; i < 10; i++) {
				String key = "Key_" + i;
				// Adding integers to the ConcurrentHashMap
				concurrentMap.put(key, i);
				System.out.println("Added: " + key + " -> " + i);
			}
		};

		// Creating multiple threads
		Thread thread1 = new Thread(addIntegers);
		Thread thread2 = new Thread(addIntegers);

		// Starting threads
		thread1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		thread2.start();

		try {
			// Waiting for threads to complete
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted: " + e.getMessage());
		}

		// Displaying the content of the ConcurrentHashMap
		System.out.println("\nContent of ConcurrentHashMap:");
		concurrentMap.forEach((key, value) -> System.out.println(key + " -> " + value));

	}
}

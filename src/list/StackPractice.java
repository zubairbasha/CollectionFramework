package list;

import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.add("Zubair");
		stack.add("Basha");
		stack.add("Ashkik");
		System.out.println(stack);
		stack.push("Nihal");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.remove(2);
		System.out.println(stack);
		String str=stack.peek();
		System.out.println(str);
		int location=stack.search("Zubair");
		System.out.println(location);
		System.out.println("Size of the Stack :"+stack.size());
		System.out.println("Size of the Stack :"+stack.capacity());
		stack.forEach(
				n->
				{
				System.out.println(n);
				}
				);
		
	}
}

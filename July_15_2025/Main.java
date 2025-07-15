package July_15_2025;

import java.util.Scanner;
import java.util.Stack;
// Other imports go here
// Do NOT change the class name
class Main{
	public static void main(String[] args) {
		// Write your code here
		Stack<Integer> stack = new Stack<>();
		
		stack.push(2);
		stack.push(12);
		stack.push(34);
		stack.push(1);
		stack.push(56);
		
		System.out.println(stack.peek());
		
		System.out.println("Size of stack:- " + stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println("Size of stack:- " + stack.size());
		
		displayElement(stack);
		
		searchElements(stack, 2);
	}
	
	
	private static void displayElement(Stack<Integer> stack) {
		int length = stack.size();
		for (int i = 0; i < length; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("Size of stack:- " + stack.size());
	}
	
	private static int searchElements(Stack<Integer> stack, int target) {
		return stack.search(target);
	}
}
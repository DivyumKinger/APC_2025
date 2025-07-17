package July_15_2025.O2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//class Main{
//	public static void main(String[] args){
//		Queue<Integer> queue = new LinkedList<>();
//		queue.add(2);
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//
//		System.out.println("Head of queue: " + queue.peek());
//
//		System.out.println("removing Head of queue: " + queue.poll());
//
//		System.out.println("Head of queue: " + queue.peek());
//
//		System.out.println(queue.remove());
//
//		System.out.println("Head of queue: " + queue.peek());
//
//	}
//}

//import java.util.*;
// Other imports go here

// class Main{
// 	public static void main(String[] args) {
 		// Write your code here
// 		Stack<Integer> stack = new Stack<>();

// 		stack.push(2);
// 		stack.push(12);
// 		stack.push(34);
// 		stack.push(1);
// 		stack.push(56);

// 		System.out.println(stack.peek());

// 		System.out.println("Size of stack:- " + stack.size());

// 		System.out.println(stack.pop());

// 		System.out.println("Size of stack:- " + stack.size());

// 		displayElement(stack);

//         searchElements(stack, 2);
// 	}


// 	private static void displayElement(Stack<Integer> stack) {
// 		int length = stack.size();
// 		for (int i = 0; i < length; i++) {
// 			System.out.println(stack.pop());
// 		}
// 		System.out.println("Size of stack:- " + stack.size());
// 	}

//     private static int searchElements(Stack<Integer> stack, int target) {
//         return stack.search(target);
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         queue.add(5);

//         System.out.println("Head of queue: " + queue.peek());

//         System.out.println("removing Head of queue: " + queue.poll());

//         System.out.println("Head of queue: " + queue.peek());

//         System.out.println(queue.remove());

//         System.out.println("Head of queue: " + queue.peek());

//     }
// }

class Main{
	public static void main(String[] args){
		Set<String> citySet = new HashSet<>();
		
		citySet.add("Mumbai");
		citySet.add("Chennai");
		citySet.add("Hyderabad");
		citySet.add("New Delhi");
		citySet.add("Mumbai");
		
		System.out.println();
		
//		if(citySet)
			
			for(String city: citySet){
				System.out.println(city);
			}
	}
}
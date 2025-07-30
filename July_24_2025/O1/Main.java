package July_24_2025.O1;
//
//import java.util.*;
//import java.util.function.Predicate;
//
//public class Main {
//	public static void main(String[] args) {
//		List<Integer> oddList = ListOperationals(numList, n->n%2!=0);
//		System.out.println(oddList);
//
//
//	}
//
//	public static Predicate<Integer> createOperation(int num) {
//		return n -> n>num;
//	}
//
//	public static List<Integer> ListOperationals(List<Integer> nums, Predicate<Integer> predicate) {
//		List<Integer> newList = new ArrayList<>();
//		for (Integer num : nums) {
//			if (predicate.test(num)) {
//				newList.add(num);
//			}
//		}
////		List<Integer> newList = July_9_2025.First.Main.listOperations(nums, predicate);
//	}
//}


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("ALL")
public class Main {
	public static void main(String[] args) {
		List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenList = listOperations(numList, n->n%2==0);
		System.out.println(evenList);
		
		List<Integer> oddList = listOperations(numList, n->n%2!=0);
		System.out.println(oddList);
		
		List<Integer> aList = listOperations(numList, n->n>8);
		System.out.println(aList);
		Predicate<Integer> p = n->n%2==0;
		System.out.println(p.test(8));
	}
	
	public static List<Integer> listOperations(List<Integer> numList, Predicate<Integer> p) {
		List<Integer> newList = new ArrayList<>();
		for (Integer i : numList) {
			if (p.test(i)) {
				newList.add(i);
			}
		}
		return newList;
	}
	
	public static Predicate<Integer> createOperation(int num) {
		return n -> n>num;
	}
	
	
}
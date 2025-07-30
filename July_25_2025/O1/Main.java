package July_25_2025.O1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Count elements
		long c = numList.stream().count();
		System.out.println("Count: " + c);
		
		// Print distinct elements
		System.out.println("Distinct Elements:");
		numList.stream()
				.distinct()
				.forEach(System.out::println);
		
		// Collect distinct elements into a list
		List<Integer> distinctList = numList.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("numList (distinct): " + distinctList);
		
		// Filter even numbers
		List<Integer> evenList = distinctList.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenList);
		
		// Sorted list
		List<Integer> sortedList = distinctList.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted: " + sortedList);
		
		// Reverse sorted list
		List<Integer> reverseSortedList = distinctList.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted-reverse: " + reverseSortedList);
		
		// Map elements (multiply by 2)
		List<Integer> mappedList = distinctList.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		System.out.println("Element * 2: " + mappedList);
		
		//max
		int max = numList.stream().max(Integer::compareTo).orElse(0);
		System.out.println("Max in the list" + max);
		
		// min
		int min = numList.stream().min(Integer::compareTo).orElse(0);
		System.out.println("Max in the list" + min);
	}
}
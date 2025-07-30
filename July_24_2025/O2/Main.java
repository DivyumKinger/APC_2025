package July_24_2025.O2;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
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
				.forEach(e -> System.out.println(e));
		
		// Collect distinct elements into a list
		List<Integer> uniList = numList.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("uniList (distinct): " + uniList);
		
		// Filter even numbers
		uniList = numList.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("uniList (even numbers): " + uniList);
	}
}
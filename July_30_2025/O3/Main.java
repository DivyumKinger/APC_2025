package July_30_2025.O3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Input: 56 89 54 23 7 90 54 90
		// WAP to input these in an ArrayList
//		int arr[] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).forEach(System.out::println);
		//* OR
		int[] arr = Arrays.stream(scan.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.filter(n -> n % 2 == 0)
				.toArray(); // ✔️ returns int[]
		
		for (int n : arr) {
			System.out.println(n);
		}
	}
}

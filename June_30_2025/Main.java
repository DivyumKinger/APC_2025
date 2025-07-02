package June_30_2025;

import java.util.Scanner;

//import java.util.Scanner;
//
public class Main {
	
	//! Q1
	//	public static void find_Post(int[] arr, int n) {
//		int b = 0;
//		int size = arr.length;
//		boolean flag = false;
//		for (int i = 0; i < size; i++) {
//			if (arr[i] == n) {
//				b = i;
//				flag = true;
//				break;
//			}
//		}
//		if (flag) System.out.println("Number is in at " + b + "th postion");
//		else System.out.println(-1);
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("input a number: ");
//		int n = sc.nextInt();
//
//		System.out.println("Input size of array: ");
//		int[] arr = new int[100];
//		int size = sc.nextInt();
//
//		System.out.println("Input array: ");
//		for (int i = 0; i < size; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		find_Post(arr, n);
//	}
	
	
	//! Q2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		} catch (Exception e){
			throw e;
//			System.out.println(e);
		}
	}
}
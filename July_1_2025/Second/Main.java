package July_1_2025.Second;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int result = num1/num2;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("after catch");
	}
}

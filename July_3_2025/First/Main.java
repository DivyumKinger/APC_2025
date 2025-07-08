package July_3_2025.First;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		ThrowDemo throwDemo = new ThrowDemo();
		try {
			String str = null;
			throwDemo.displayValue(str);
		} catch (NullPointerException exp) {
			System.out.println(exp.getMessage());
		}
		
		try {
			throwDemo.division(7, 0);
		} catch (ArithmeticException exp) { // Fixed typo here
			System.out.println("Exception while dividing: " + exp.getMessage());
		}
	}
}

// Complete this class as required
class ThrowDemo {
	public void displayValue(String str) {
		if (str == null) {
			throw new NullPointerException("String value is null!");
		} else {
			System.out.println("String value: " + str);
		}
	}
	
	public void division(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed!");
		} else {
			System.out.println("Result: " + (a / b));
		}
	}
}

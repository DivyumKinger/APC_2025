package July_3_2025.Second;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
			System.out.println("You are eligible to vote!");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage()); // Will call toString()
		}
	}
	
	// Method to check age
	static void checkAge(int age) {
		if (age < 18) {
			throw new InvalidAgeException("Age must be at least 18 to vote.");
		}
	}
}

class InvalidAgeException extends RuntimeException { // Fixed typo
	@Serial
	private static final long serialVersionUID = 1L;
	
	InvalidAgeException() {
		super();
	}
	
	InvalidAgeException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		return "InvalidAgeException: " + getMessage();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
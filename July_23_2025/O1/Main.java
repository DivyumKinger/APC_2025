package July_23_2025.O1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String input = "programming";  // You can change this to test
		
		Character repeatedChar = findFirstRepeatedChar(input);
		
		if (repeatedChar != null) {
			System.out.println("First repeated character: " + repeatedChar);
		} else {
			System.out.println("No repeated character");
		}
	}
	
	public static Character findFirstRepeatedChar(String str) {
		Set<Character> seen = new HashSet<>();
		
		for (char c : str.toCharArray()) {
			if (seen.contains(c)) {
				return c;
			}
			seen.add(c);
		}
		return null;
	}
}
package July_17_2025.O2;

//Count the no of letters in a string using hashmap collections framework in java

// Java program to count frequencies of
// characters in string using Hashmap

import java.io.*;
import java.util.*;

class OccurrenceOfCharInString {
	static void characterCount(String inputString) {
		// Creating a HashMap containing char
		// as a key and occurrences as  a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		// Converting given string to char array
		
		char[] strArray = inputString.toCharArray();
		
		// checking each char of strArray
		for (char c : strArray) {
			if (c == ' ') {
				c = '|';
			}
			if (charCountMap.containsKey(c)) {
				
				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		
		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	// Driver Code
//	public static void main(String[] args) {
//		String str = "I am coding on IntelliJ Idea";
//		characterCount(str);
//	}
	public static void main(String[] args) {
//		String s = "I am a student";
		String s = "I am coding on IntelliJ Idea";
		Map<Character, Integer> wMap = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ( c!= ' '){
				if (wMap.containsKey(c)){
					wMap.put(c, wMap.get(c) + 1);
				} else  {
					wMap.put(c, 1);
				}
			}
		}
		System.out.println(wMap);
	}
}

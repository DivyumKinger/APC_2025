package July_30_2025.O2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(29);
		numbers.add(34);
		numbers.add(12);
		numbers.add(99);
		
		List<Integer> inHundreds = new ArrayList<>();
		//for (int i = 0; i<numbers.size(); i++)
		for(Integer number: numbers) {
			inHundreds.add(number + 10);
		}
		
		List<Integer> inHundreds2 = numbers.stream().filter(number -> number % 2 == 1).map(number -> number * 10).collect(Collectors.toList());
		System.out.println(inHundreds);
		System.out.println(inHundreds2);
	}
}
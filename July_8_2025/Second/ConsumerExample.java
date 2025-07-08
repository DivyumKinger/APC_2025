package July_8_2025.Second;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Delhi", "Bangalore");
		
		// Using lambda expression
		nameList.forEach(System.out::println);
		
		// Or using method reference
		// nameList.forEach(System.out::println);
	}
}
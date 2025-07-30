package July_30_2025.O1;

import java.util.function.*;

class Main {
	static Function<Integer, Integer> incrementFunction = number -> number + 1;
	
	static BiFunction<String, String, String> concatBiFunction = (fName, lName) -> fName + " " + lName;
	
	static Predicate<Integer> isEven = number -> number % 2 ==0;
	
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	static BiPredicate<Integer, Integer> isEqual = (number1, number2) -> number1 == number2;
	
	static Consumer<String>  greetings = name -> System.out.println("Hello "+name);
	
	static Supplier<Double> randomNumber = () -> Math.random();
	
	public static int increment(int number) {
		return number + 1;
	}
	
	public static void main(String[] args) {
		int number = 9;
		// System.out.println(increment(number));                    // Output: 10
		// System.out.println(incrementFunction.apply(number));      // Output: 10
		
		// System.out.println(concatBiFunction.apply("Divyum", "Kinger")); // Output: Divyum Kinger
		
		// System.out.println(isEven.test(number));
		
		System.out.println(incrementFunction.andThen(multiplyBy10).apply(number)); //do both things in a single call
		System.out.println(multiplyBy10.andThen(incrementFunction).apply(number)); //do both things in a single call
		
		System.out.println(isEqual.test(10, 10)); //predicates use .test not .apply
		
		greetings.accept("Divyum");
		
		System.out.println(randomNumber.get());
	}
}

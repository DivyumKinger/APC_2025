package July_8_2025.Second;

import java.util.function.BinaryOperator;

// Do NOT change the class name
@SuppressWarnings("ALL")
class Main {
	public static void main(String[] args) {
		MaxFinder obj = new MaxFinderImp1();
		System.out.println(obj.maximum(8, 12));
		
		// Using lambda expression
		MaxFinder obj1 = (int a, int b) -> (a > b) ? a : b;
		System.out.println(obj1.maximum(34, 67));
		
		// Using BinaryOperator Functional Interface
		BinaryOperator<Integer> obj4 = (a, b) -> (a > b) ? a : b;
		System.out.println(obj4.apply(99, 45));
	}
}

interface MaxFinder {
	int maximum(int num1, int num2);
}

@SuppressWarnings("ALL")
class MaxFinderImp1 implements MaxFinder {
	@Override
	public int maximum(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
}

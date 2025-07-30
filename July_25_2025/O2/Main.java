package July_25_2025.O2;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;


public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("E01", 24, "Ramesh", 'M', 12000),
				new Employee("E02", 25, "Suresh", 'M', 18000),
				new Employee("E03", 26, "Arti", 'F', 32000),
				new Employee("E04", 44, "Mahesh", 'M', 44000),
				new Employee("E05", 32, "Ritu", 'F', 34000)
		);
		
		System.out.println(employees);
		
		//! 1. Count by gender
		getCountByGender(employees, 'M');
		getCountByGender(employees, 'F');
		
		
		//! 2. Max salary by gender
//		Map<Character, OptionalInt> maxSalaryByGender = employees.stream()
//				.collect(groupingBy(Employee::getGender,
//						mapping(Employee::getSalary, collectingAndThen(toList(), list -> list.stream().mapToInt(Integer::intValue).max()))));
//		System.out.println("Max salary by gender: " + maxSalaryByGender);
		
		
		//! 3. Employee with max salary by gender
//		Map<Character, Optional<Employee>> maxEmployeeByGender = employees.stream()
//				.collect(groupingBy(Employee::getGender,
//						maxBy(Comparator.comparingInt(Employee::getSalary))));
//		System.out.println("Employee with max salary by gender:");
//		maxEmployeeByGender.forEach((gender, emp) -> System.out.println(gender + " -> " + emp.orElse(null)));
		
		//! 4. Sum of salaries by gender
//		Map<Character, Integer> salarySumByGender = employees.stream()
//				.collect(groupingBy(Employee::getGender, summingInt(Employee::getSalary)));
//		System.out.println("Sum of salaries by gender: " + salarySumByGender);

		//! 5. Sum of salaries of all employees
//		int totalSalary = employees.stream()
//				.mapToInt(Employee::getSalary)
//				.sum();
//		System.out.println("Total salary of all employees: " + totalSalary);

		//! 6. Employees with salaries > 20k and < 50k
//		List<Employee> salaryBetween20kAnd50k = employees.stream()
//				.filter(e -> e.getSalary() > 20000 && e.getSalary() < 50000)
//				.collect(toList());
//		System.out.println("Employees with salary between 20k and 50k: " + salaryBetween20kAnd50k);

		//! 7. List of all employee names
//		List<String> allEmployeeNames = employees.stream()
//				.map(Employee::getName)
//				.collect(toList());
//		System.out.println("All employee names: " + allEmployeeNames);

		//! 8. Sorted list of all employee names
//		List<String> sortedEmployeeNames = employees.stream()
//				.map(Employee::getName)
//				.sorted()
//				.collect(toList());
//		System.out.println("Sorted employee names: " + sortedEmployeeNames);
	}
	
	private static void getCountByGender(List<Employee> employees, char g) {
		long c = employees.stream().filter(e -> e.getGender() == g).count();
		System.out.println("Employee count by gender: "+ g + " " + c);
		
		//! without stream API
//		int mCount = 0;
//		int fCount = 0;
//		for (Employee e : employees) {
//			if (e.getGender() == g) {
//				mCount++;
//			} else  {
//				fCount++;
//			}
//		}
//		System.out.println("Employee count by males: "+ mCount);
//		System.out.println("Employee count by females: "+ fCount);
	}
}

class Employee {
	
	private String empID;
	private int age;
	private String name;
	private char gender;
	private int salary;
	
	public Employee(String id, int age, String name, char gender, int salary) {
		this.empID = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public String getEmpID() {
		return empID;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return name + " (" + empID + ", ₹" + salary + ")";
	}
}
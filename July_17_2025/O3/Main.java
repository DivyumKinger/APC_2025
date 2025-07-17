package July_17_2025.O3;

import java.util.*;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Zara"));
		personList.add(new Person("Alice"));
		personList.add(new Person("Bob"));
		
		Collections.sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		System.out.println(personList);
	}
}
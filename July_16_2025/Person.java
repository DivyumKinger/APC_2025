package July_16_2025;

import java.util.Set;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static Person searchName(Set<Person> personSet, String name){
		for(Person p : personSet){
			if(p.name.equals(name))
				return p;
		}
		return null;
	}
	
}

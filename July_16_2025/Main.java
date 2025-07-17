package July_16_2025;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("John", 20);
		Person p2 = new Person("Jane", 25);
		HashSet<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		
		for (Person p : personSet) {
			p.display();
		}
		
		Person found = Person.searchName(personSet, "John");  // Fixed
		if (found != null) {
			System.out.println("Found person:");
			found.display();
		} else {
			System.out.println("Person not found");
		}
		
		
		// DEQUE
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		System.out.println(deque);
		deque.removeFirst();
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		
		// Map
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 20);
		map.put("Jane", 25);
		map.put("Jill", 30);
		map.put("Joe", 35);
		System.out.println(map);
		map.remove("Jill");
		System.out.println(map);
		System.out.println(map.get("John"));
	}
}

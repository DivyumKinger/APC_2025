package July_22_2025.O1;

import java.util.*;

// Do NOT change the class name
class Main {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Running a task");
		
		// Start a virtual thread using Thread.ofVirtual().start()
		Thread virThre = Thread.ofVirtual().start(() -> System.out.println("First virtual thread"));
		
		try {
			virThre.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Start another virtual thread using lambda 'r'
		Thread vt = Thread.ofVirtual().start(r);
		try {
			vt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
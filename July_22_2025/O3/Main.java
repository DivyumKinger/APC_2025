package July_22_2025.O3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> numList = Collections.synchronizedList(new ArrayList<Integer>());
		
		Thread t1 = new Thread(new SynchronisedListDemo(numList));
		Thread t2 = new Thread(new SynchronisedListDemo(numList));
		Thread t3 = new Thread(new SynchronisedListDemo(numList));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final List: " + numList);
	}
}

class SynchronisedListDemo implements Runnable {
	private List<Integer> list;
	
	public SynchronisedListDemo(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 100));
			System.out.println(Thread.currentThread().getName() + " added a number");
		}
	}
}
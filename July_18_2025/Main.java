package July_18_2025;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		};
		
		MyRunnable mr = new MyRunnable();
		Thread thread1 = new Thread(mr, "Thread1");
		Thread thread2 = new Thread(mr, "Thread2");
		Thread thread3 = new Thread(mr, "Thread3");
		Thread thread4 = new Thread(mr, "Thread4");
		
	}
}
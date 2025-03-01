package thread_Safe;

public class Main {
	public static void main(String[] args) {
		// Tạo nhiều luồng để kiểm tra tính thread-safe
		Runnable task = () -> {
			ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
			System.out.println("Instance hashcode: " + instance.hashCode());
		};

		// Tạo và khởi chạy nhiều luồng
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		Thread thread3 = new Thread(task);

		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
		Runnable task2 = () -> {
			ThreadSafeSingleton instance = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
			System.out.println("Instance hashcode: " + instance.hashCode());
		};

		// Tạo và khởi chạy nhiều luồng
		Thread thread4 = new Thread(task2);
		Thread thread5 = new Thread(task2);
		Thread thread6 = new Thread(task2);

		thread4.start();
		thread5.start();
		thread6.start();
	}
}

package lazy_singleton;

public class Main {
	public static void main(String[] args) {
//		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
//		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
		
		
		//Test môi trường đa luồng
		Runnable task = () -> {
            LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
            System.out.println("Instance hashcode: " + instance.hashCode());
        };

        // Tạo nhiều luồng để kiểm tra tính thread-safety
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
	}
}

package eager_Singleton;

public class Main {
	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
		System.out.println("Instance 1: " + instance1.hashCode());
		System.out.println("Instance 2: " + instance2.hashCode());
	}
}

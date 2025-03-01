package static_Block;

public class Main {
	public static void main(String[] args) {
		StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

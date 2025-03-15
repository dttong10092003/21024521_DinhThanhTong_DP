package bt;

public class Main {
	public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();

        Observer display1 = new DisplayMonitor("Màn hình 1");
        Observer display2 = new DisplayMonitor("Màn hình 2");
        Observer logger = new LogSystem();

        lightSwitch.addObserver(display1);
        lightSwitch.addObserver(display2);
        lightSwitch.addObserver(logger);

        System.out.println("Nhấn công tắc...");
        lightSwitch.toggle();  
        lightSwitch.toggle(); 
        
        lightSwitch.removeObserver(display2);
        System.out.println("Nhấn công tắc...");
        lightSwitch.toggle();
        
    }
}

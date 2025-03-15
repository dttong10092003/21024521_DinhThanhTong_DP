package bt;

public class DisplayMonitor implements Observer {
    private String name;

    public DisplayMonitor(String name) {
        this.name = name;
    }

    @Override
    public void update(boolean isOn) {
        System.out.println(name + " hiển thị: Đèn " + (isOn ? "BẬT " : "TẮT "));
    }
}


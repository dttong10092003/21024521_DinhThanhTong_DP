package bt;

public class LogSystem implements Observer {
    @Override
    public void update(boolean isOn) {
        System.out.println("[LOG] Trạng thái đèn đã thay đổi: " + (isOn ? "ON" : "OFF"));
    }
}


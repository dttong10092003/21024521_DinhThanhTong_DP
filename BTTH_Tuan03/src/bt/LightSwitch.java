package bt;

import java.util.ArrayList;
import java.util.List;

public class LightSwitch {
    private List<Observer> observers = new ArrayList<>();
    private boolean isOn = false; 

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(isOn);
        }
    }

    public void toggle() {
        isOn = !isOn;
        System.out.println("- Đèn hiện tại: " + (isOn ? "ON" : "OFF"));
        notifyObservers();
    }
}

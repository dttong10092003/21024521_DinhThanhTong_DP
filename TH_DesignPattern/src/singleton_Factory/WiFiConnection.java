package singleton_Factory;

public class WiFiConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting via WiFi...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from WiFi...");
    }
}



package singleton_Factory;

public class EthernetConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting via Ethernet...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Ethernet...");
    }
}

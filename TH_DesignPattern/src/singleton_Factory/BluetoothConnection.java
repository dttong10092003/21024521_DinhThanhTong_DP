package singleton_Factory;

public class BluetoothConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting via Bluetooth...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Bluetooth...");
    }
}

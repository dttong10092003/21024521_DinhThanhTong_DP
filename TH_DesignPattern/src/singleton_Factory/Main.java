package singleton_Factory;

public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        ConnectionManager connectionManager = ConnectionManager.getInstance();

        // Create Wi-Fi connection
        ConnectionFactory wifiFactory = new WiFiConnectionFactory();
        connectionManager.setConnection(wifiFactory);
        connectionManager.connect();  // Connect via WiFi
        connectionManager.disconnect();  // Disconnect from WiFi

        // Create Ethernet connection
        ConnectionFactory ethernetFactory = new EthernetConnectionFactory();
        connectionManager.setConnection(ethernetFactory);
        connectionManager.connect();  // Connect via Ethernet
        connectionManager.disconnect();  // Disconnect from Ethernet

        // Create Bluetooth connection
        ConnectionFactory bluetoothFactory = new BluetoothConnectionFactory();
        connectionManager.setConnection(bluetoothFactory);
        connectionManager.connect();  // Connect via Bluetooth
        connectionManager.disconnect();  // Disconnect from Bluetooth
    }
}


package singleton_Factory;

public class ConnectionManager {
    private static ConnectionManager instance;
    private Connection currentConnection;

    // Private constructor to prevent instantiation
    private ConnectionManager() {}

    // Method to get the singleton instance
    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    // Method to set current connection
    public void setConnection(ConnectionFactory factory) {
        this.currentConnection = factory.createConnection();
    }

    // Methods to use the current connection
    public void connect() {
        if (currentConnection != null) {
            currentConnection.connect();
        } else {
            System.out.println("No connection set.");
        }
    }

    public void disconnect() {
        if (currentConnection != null) {
            currentConnection.disconnect();
        } else {
            System.out.println("No connection set.");
        }
    }
}


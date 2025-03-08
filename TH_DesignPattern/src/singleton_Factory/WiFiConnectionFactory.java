package singleton_Factory;

public class WiFiConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new WiFiConnection();
    }
}

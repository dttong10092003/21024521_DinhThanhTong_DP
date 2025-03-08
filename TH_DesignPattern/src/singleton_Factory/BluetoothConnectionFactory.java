package singleton_Factory;

public class BluetoothConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new BluetoothConnection();
    }
}

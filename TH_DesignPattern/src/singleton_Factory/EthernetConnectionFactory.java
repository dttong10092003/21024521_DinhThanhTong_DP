package singleton_Factory;

public class EthernetConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new EthernetConnection();
    }
}

package strategy_DesignPattern_01;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();

        order.setStrategy(new ProcessingOrderStrategy());
        order.processOrder();

        order.setStrategy(new DeliveredOrderStrategy());
        order.processOrder();

        order.setStrategy(new CanceledOrderStrategy());
        order.processOrder();
    }
}

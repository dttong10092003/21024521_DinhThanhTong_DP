package decorator_DesignPattern_01;

public class Main {
    public static void main(String[] args) {
        Order order = new SimpleOrder();
        System.out.println("SimpleOrder");
        order.processOrder();
        order = new ProcessingOrderDecorator(order);
        System.out.println("\nProcessingOrderDecorator");
        order.processOrder();
        order = new DeliveredOrderDecorator(order);
        System.out.println("\nDeliveredOrderDecorator");
        order.processOrder();
        order = new CanceledOrderDecorator(order);
        System.out.println("\nCanceledOrderDecorator");
        order.processOrder();
    }
}

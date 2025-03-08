package decorator_DesignPattern_01;

public class OrderDecorator implements Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    public void processOrder() {
        order.processOrder();
    }
}

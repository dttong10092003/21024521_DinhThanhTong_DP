package decorator_DesignPattern_01;

public class DeliveredOrderDecorator extends OrderDecorator {
    public DeliveredOrderDecorator(Order order) {
        super(order);
    }

    public void processOrder() {
        super.processOrder();
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}

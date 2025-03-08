package decorator_DesignPattern_01;

public class CanceledOrderDecorator extends OrderDecorator {
    public CanceledOrderDecorator(Order order) {
        super(order);
    }

    public void processOrder() {
        super.processOrder();
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}

package decorator_DesignPattern_01;

public class ProcessingOrderDecorator extends OrderDecorator {
    public ProcessingOrderDecorator(Order order) {
        super(order);
    }

    public void processOrder() {
        super.processOrder();
        System.out.println("Đóng gói và vận chuyển.");
    }
}
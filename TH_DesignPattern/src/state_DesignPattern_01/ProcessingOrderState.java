package state_DesignPattern_01;

public class ProcessingOrderState implements OrderState {
    public void processOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState());
    }
}

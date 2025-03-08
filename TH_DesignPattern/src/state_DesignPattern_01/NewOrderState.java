package state_DesignPattern_01;

public class NewOrderState implements OrderState {
    public void processOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingOrderState());
    }
}
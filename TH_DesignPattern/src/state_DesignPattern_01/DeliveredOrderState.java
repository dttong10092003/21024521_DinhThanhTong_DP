package state_DesignPattern_01;

public class DeliveredOrderState implements OrderState {
    public void processOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
        order.setState(new CanceledOrderState());
    }
}

package state_DesignPattern_01;

public class CanceledOrderState implements OrderState {
    public void processOrder(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}

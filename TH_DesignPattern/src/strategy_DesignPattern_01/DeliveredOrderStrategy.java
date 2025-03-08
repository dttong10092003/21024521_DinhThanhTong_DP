package strategy_DesignPattern_01;

public class DeliveredOrderStrategy implements OrderStrategy {
    public void processOrder() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}

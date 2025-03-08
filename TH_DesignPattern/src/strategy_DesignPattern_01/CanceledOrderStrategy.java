package strategy_DesignPattern_01;

public class CanceledOrderStrategy implements OrderStrategy {
    public void processOrder() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}

package strategy_DesignPattern_01;

public class ProcessingOrderStrategy implements OrderStrategy {
    public void processOrder() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}

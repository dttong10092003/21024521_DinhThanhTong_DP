package strategy_DesignPattern_01;

public class NewOrderStrategy implements OrderStrategy {
    public void processOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}

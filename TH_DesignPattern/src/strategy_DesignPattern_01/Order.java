package strategy_DesignPattern_01;

public class Order {
    private OrderStrategy strategy;

    public Order() {
        strategy = new NewOrderStrategy();  
    }

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        strategy.processOrder();
    }
}

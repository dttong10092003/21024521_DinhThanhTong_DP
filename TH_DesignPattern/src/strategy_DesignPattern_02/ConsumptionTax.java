package strategy_DesignPattern_02;

public class ConsumptionTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.05;
    }
}

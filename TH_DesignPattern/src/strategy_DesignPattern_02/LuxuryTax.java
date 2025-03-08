package strategy_DesignPattern_02;

public class LuxuryTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.2;
    }
}

package state_DesignPattern_02;

public class LuxuryState implements TaxState {
    public double calculateTax(double price) {
        return price * 0.2;
    }
}

package decorator_DesignPattern_02;

public class LuxuryDecorator extends TaxDecorator {
    public LuxuryDecorator(Tax tax) {
        super(tax);
    }

    public double calculateTax(double price) {
        return super.calculateTax(price) + price * 0.2;
    }
}

package decorator_DesignPattern_02;

public class VATDecorator extends TaxDecorator {
    public VATDecorator(Tax tax) {
        super(tax);
    }

    public double calculateTax(double price) {
        return super.calculateTax(price) + price * 0.1;
    }
}

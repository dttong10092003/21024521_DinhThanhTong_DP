package decorator_DesignPattern_02;

public class TaxDecorator implements Tax {
    protected Tax tax;

    public TaxDecorator(Tax tax) {
        this.tax = tax;
    }

    public double calculateTax(double price) {
        return tax.calculateTax(price);
    }
}

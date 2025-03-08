package decorator_DesignPattern_02;

public class Main {
	public static void main(String[] args) {
		Tax baseTax = new BaseTax();
		Tax combinedTax = new VATDecorator(new LuxuryDecorator(baseTax));

		Product p1 = new Product("Laptop", 1000, combinedTax);
		p1.displayPriceWithTax();
	}
}

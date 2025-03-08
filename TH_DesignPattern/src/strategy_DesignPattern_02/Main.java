package strategy_DesignPattern_02;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 1000, new VATTax());
		p1.displayPriceWithTax();

		Product p2 = new Product("Rượu cao cấp", 500, new LuxuryTax());
		p2.displayPriceWithTax();
	}
}

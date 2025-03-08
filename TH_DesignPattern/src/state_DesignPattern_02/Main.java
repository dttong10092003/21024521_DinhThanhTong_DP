package state_DesignPattern_02;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("Laptop", 1000);
		product.displayPriceWithTax();

		product.setTaxState(new LuxuryState());
		product.displayPriceWithTax();
	}
}

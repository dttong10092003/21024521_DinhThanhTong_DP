package state_DesignPattern_02;

public class Product {
	private String name;
	private double price;
	private TaxState taxState;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.taxState = new VATState(); // Mặc định là VAT
	}

	public void setTaxState(TaxState taxState) {
		this.taxState = taxState;
	}

	public double calculateTax() {
		return taxState.calculateTax(price);
	}

	public void displayPriceWithTax() {
		System.out.println(name + " - Giá sau thuế: " + (price + calculateTax()));
	}
}

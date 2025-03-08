package strategy_DesignPattern_02;

public class Product {
	private String name;
	private double price;
	private TaxStrategy taxStrategy;

	public Product(String name, double price, TaxStrategy taxStrategy) {
		this.name = name;
		this.price = price;
		this.taxStrategy = taxStrategy;
	}

	public double calculateTax() {
		return taxStrategy.calculateTax(price);
	}

	public void displayPriceWithTax() {
		System.out.println(name + " - Giá sau thuế: " + (price + calculateTax()));
	}
}

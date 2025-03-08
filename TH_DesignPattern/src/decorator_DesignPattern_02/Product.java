package decorator_DesignPattern_02;

public class Product {
	private String name;
	private double price;
	private Tax tax;

	public Product(String name, double price, Tax tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void displayPriceWithTax() {
		System.out.println(name + " - Giá sau thuế: " + (price + tax.calculateTax(price)));
	}
}

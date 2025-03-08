package no_DesignPattern_02;

public class Product {
    private String name;
    private double price;
    private String taxType;

    public Product(String name, double price, String taxType) {
        this.name = name;
        this.price = price;
        this.taxType = taxType;
    }

    public double calculateTax() {
        if (taxType.equals("VAT")) {
            return price * 0.1;
        } else if (taxType.equals("Consumption Tax")) {
            return price * 0.05;
        } else if (taxType.equals("Luxury Tax")) {
            return price * 0.2;
        } else {
            return 0;
        }
    }

    public void displayPriceWithTax() {
        System.out.println(name + " - Giá sau thuế: " + (price + calculateTax()));
    }
}



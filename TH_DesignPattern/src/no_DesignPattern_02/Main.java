package no_DesignPattern_02;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, "VAT");
        p1.displayPriceWithTax();

        Product p2 = new Product("Rượu cao cấp", 500, "Luxury Tax");
        p2.displayPriceWithTax();
    }
}


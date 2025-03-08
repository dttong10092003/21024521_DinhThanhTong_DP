package no_DesignPattern_01;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();

        order.setStatus("Đang xử lý");
        order.processOrder();

        order.setStatus("Đã giao");
        order.processOrder();

        order.setStatus("Hủy");
        order.processOrder();
    }
}

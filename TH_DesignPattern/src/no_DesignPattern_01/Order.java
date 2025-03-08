package no_DesignPattern_01;

public class Order {
    private String status;

    public Order() {
        this.status = "Mới tạo";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void processOrder() {
        if (status.equals("Mới tạo")) {
            System.out.println("Kiểm tra thông tin đơn hàng.");
        } else if (status.equals("Đang xử lý")) {
            System.out.println("Đóng gói và vận chuyển.");
        } else if (status.equals("Đã giao")) {
            System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
        } else if (status.equals("Hủy")) {
            System.out.println("Hủy đơn hàng và hoàn tiền.");
        }
    }
}




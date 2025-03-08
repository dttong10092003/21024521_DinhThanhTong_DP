package state_DesignPattern_01;

public class Order {
    private OrderState state;

    public Order() {
        state = new NewOrderState();  // Mới tạo là trạng thái ban đầu
    }

    // Phương thức setState để thay đổi trạng thái
    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }
}

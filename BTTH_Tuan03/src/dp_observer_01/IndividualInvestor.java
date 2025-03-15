package dp_observer_01;

public class IndividualInvestor implements Investor {
    private String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("📩 " + name + " nhận thông báo: Cổ phiếu " + stockName + " hiện có giá " + price);
    }
}


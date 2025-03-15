package dp_observer_01;

public class Main {
	public static void main(String[] args) {
		// Tạo cổ phiếu
		Stock appleStock = new Stock("AAPL", 150.0);

		// Tạo nhà đầu tư
		Investor investor1 = new IndividualInvestor("Nguyễn Văn A");
		Investor investor2 = new IndividualInvestor("Trần Thị B");

		// Đăng ký nhận thông báo
		appleStock.addInvestor(investor1);
		appleStock.addInvestor(investor2);

		// Thay đổi giá cổ phiếu
		System.out.println("\n🔹 Thay đổi giá cổ phiếu 🔹");
		appleStock.setPrice(155.0);
		appleStock.setPrice(160.5);

		// Một nhà đầu tư hủy đăng ký
		appleStock.removeInvestor(investor1);

		System.out.println("\n🔹 Nhà đầu tư A đã hủy đăng ký 🔹");
		appleStock.setPrice(162.0);
	}
}

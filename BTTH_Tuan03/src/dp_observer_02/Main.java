package dp_observer_02;

public class Main {
	public static void main(String[] args) {
		// Tạo công việc
		Task task = new Task("Thiết kế giao diện");

		// Tạo thành viên nhóm
		TeamMember dev1 = new Developer("Nguyễn Văn A");
		TeamMember dev2 = new Developer("Trần Thị B");

		// Đăng ký nhận thông báo
		task.addMember(dev1);
		task.addMember(dev2);

		// Thay đổi trạng thái công việc
		System.out.println("\n🔹 Cập nhật trạng thái công việc 🔹");
		task.updateStatus("In Progress"); // Đang thực hiện
		task.updateStatus("Completed"); // Hoàn thành

		// Một thành viên rời khỏi nhóm
		task.removeMember(dev1);

		System.out.println("\n🔹 Thành viên A đã rời nhóm 🔹");
		task.updateStatus("Deployed"); // Đã triển khai
	}
}

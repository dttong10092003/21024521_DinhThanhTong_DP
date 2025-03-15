package dp_composite;

public class Main {
	public static void main(String[] args) {
		// Tạo tập tin
		File file1 = new File("Document.pdf", 500);
		File file2 = new File("Photo.jpg", 1200);
		File file3 = new File("Video.mp4", 5000);

		// Tạo thư mục
		Folder mainFolder = new Folder("Root");
		Folder subFolder1 = new Folder("Documents");
		Folder subFolder2 = new Folder("Media");

		// Thêm tập tin vào thư mục con
		subFolder1.addComponent(file1);
		subFolder2.addComponent(file2);
		subFolder2.addComponent(file3);

		// Thêm thư mục con vào thư mục chính
		mainFolder.addComponent(subFolder1);
		mainFolder.addComponent(subFolder2);

		// Hiển thị toàn bộ hệ thống
		System.out.println("\nHiển thị toàn bộ hệ thống thư mục và tập tin:");
		mainFolder.showDetails();
	}
}

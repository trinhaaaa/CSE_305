package Assignment2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            DocumentDirector director = new DocumentDirector();

            // Chọn loại tài liệu
            System.out.println("Chọn loại tài liệu muốn tạo:");
            System.out.println("1. Normal Document (Tài liệu thường)");
            System.out.println("2. Confidential Document (Tài liệu bảo mật)");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            // Nhập tên tài liệu
            System.out.print("Nhập tên tài liệu (không cần phần mở rộng): ");
            String fileName = scanner.nextLine();

            // Nhập nội dung tài liệu
            System.out.print("Nhập nội dung tài liệu: ");
            String content = scanner.nextLine();

            DocumentBuilder builder;
            if (choice == 1) {
                builder = new NormalDoc();
            } else if (choice == 2) {
                builder = new ConfidentialDoc();
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
                return;
            }

            director.setBuilder(builder);
            director.construct(fileName, content);

            System.out.println("Tài liệu đã được tạo thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

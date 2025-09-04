
package soLuoc;

import java.util.Locale; // chuyển đổi để nhập dấu "."
import java.util.Scanner;

public class Bai05_NhapDuLieuTuBanPhim {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // chuyển qua ngôn ngữ mỹ để nhập thập phân dấu "."

		// Nhập từ bàn phím sử dụng thư viện scanner
		// Scanner tenBien = new Scanner(System.in);
		// system.in nhập từ bàn phím
		Scanner nhapTuBanPhim = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");

		// nextLine: nhập chuỗi
		String hoVaTen = nhapTuBanPhim.nextLine();

		// nextInt: nhập số nguyên
		// nextLong: nhập số nguyên (dung lượng lớn hơn int)
		System.out.print("Nhập mã số sinh viên: ");
		long maSV = nhapTuBanPhim.nextLong();

		// nextFloat: nhập số thực
		// Nhập số thập phân nhập bằng dấu ,
		// Ví dụ: 9,5 25,6 ....
		// Nhưng nếu dùng thư viện "java.util.Locale" và code chuyển đổi
		// "Locale.setDefault(Locale.US)" thì nhập được dấu "."

		System.out.print("Nhập điểm trung bình: ");
		float diemTB = nhapTuBanPhim.nextFloat();

		System.out.println("Họ và tên\tMã sinh viên\tĐiểm trung bình");

		// sử dụng printf như trong c
		System.out.printf("%-5s%16d%19.2f\n", hoVaTen, maSV, diemTB);

		// sử dụng print
		System.out.println(hoVaTen + "\t" + maSV + "\t" + diemTB);

		// đóng hàm thư viện scanner (đóng nhập từ bàn phím)
		nhapTuBanPhim.close();
	}
}

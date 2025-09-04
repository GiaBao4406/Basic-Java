package soLuoc;

import java.util.Scanner;

public class Bai06_PhepToanCoBan {
	public static int tinhTong(int a, int b) {
		return a + b;
	}

	public static int tinhHieu(int a, int b) {
		return a - b;
	}

	public static long tinhTich(int a, int b) {
		return a * b;
	}

	public static float tinhThuong(int a, int b) {
		return (float) a / b;
	}

	public static void main(String[] args) {
		int a, b;
		Scanner nhapTuBanPhim = new Scanner(System.in);

		System.out.print("Nhập a: ");
		a = nhapTuBanPhim.nextInt();

		System.out.print("Nhập b: ");
		b = nhapTuBanPhim.nextInt();

		int tong, hieu;
		long tich;
		float thuong;

		tong = tinhTong(a, b);
		hieu = tinhHieu(a, b);
		tich = tinhTich(a, b);
		thuong = tinhThuong(a, b);

		System.out.println("Tổng = " + tong);
		System.out.println("Hiệu = " + hieu);
		System.out.println("Tích = " + tich);
		System.out.println("Thương = " + thuong);

		System.out.println(a + " = " + b + ": " + (a == b));
		System.out.println(a + " > " + b + ": " + (a > b));
		System.out.println(a + " >= " + b + ": " + (a >= b));
		System.out.println(a + " < " + b + ": " + (a < b));
		System.out.println(a + " <= " + b + ": " + (a <= b));

		String ketQua = (a % 2 == 0) ? "số chẵn" : "số lẻ";
		System.out.println("Kết quả: a là " + ketQua);
		
		nhapTuBanPhim.close();
	}
}

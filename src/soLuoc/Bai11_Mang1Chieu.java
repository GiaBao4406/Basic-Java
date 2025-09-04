package soLuoc;

import java.util.Scanner;

public class Bai11_Mang1Chieu {
	public static void nhapMang(int n, int a[]) {
		Scanner nhapTuBanPhim = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập giá trị phần tử " + i + ": ");
			a[i] = nhapTuBanPhim.nextInt();
		}
		nhapTuBanPhim.close();
	}

	public static void xuatMang(int n, int a[]) {
		System.out.println("Mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Giá trị phần tử " + i + ": " + a[i]);
		}
	}

	public static int tongMang(int n, int[] a) {
		int tong = 0;
		for (int i = 0; i < n; i++) {
			tong += a[i];
		}
		return tong;
	}

	public static void main(String[] args) {
		// khai báo
		int[] a;
		final int MAXSIZE = 100;

		// khởi tạo mảng
		a = new int[MAXSIZE];

		Scanner nhapTuBanPhim = new Scanner(System.in);

		// nhập mảng
		int n;
		System.out.print("Nhập số lượng phần tử: ");
		n = nhapTuBanPhim.nextInt();

		nhapMang(n, a);

		// xuất mảng
		xuatMang(n, a);
		
		// tổng mảng
		int tong = tongMang(n, a);
		System.out.println("Tổng mảng = " +tong);
		
		nhapTuBanPhim.close();
	}
}

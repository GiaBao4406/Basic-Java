package soLuoc;

import java.util.Scanner;

public class Bai12_Mang2Chieu {
	public static void main(String[] args) {
		Scanner nhapTuBanPhim = new Scanner(System.in);
		// Khai báo mảng
		int[][] a;
		final int MAXSIZE = 100;

		// Khởi tạo mảng
		a = new int[MAXSIZE][MAXSIZE];

		// nhập mảng
		int n;
		System.out.print("Nhập số lượng phần tử: ");
		n = nhapTuBanPhim.nextInt();

		// Ma trận vuông
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// System.out.print("Nhập phần tử A[" + i + "][" + j + "]: ");
				// a[i][j] = nhapTuBanPhim.nextInt();
				a[i][j] = (int) (Math.random() * 101);
			}
		}

		// Xuất mảng
		System.out.println("Mảng 2 chiều: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf(" %3d", a[i][j]);
			}
			System.out.println();
		}
		nhapTuBanPhim.close();
	}
}

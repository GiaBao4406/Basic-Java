package soLuoc;

import java.util.Scanner;

public class Bai09_CauDieuKien {
	public static void main(String[] args) {
		Scanner nhapTuBanPhim = new Scanner(System.in);

		int a;
		System.out.print("Nhập a: ");
		a = nhapTuBanPhim.nextInt();

		if (a % 2 == 0)
			System.out.println(a + " là số chia hết cho 2");

		else if (a % 3 == 0)
			System.out.println(a + " là chia hết cho 3");
		else
			System.out.println(a + " không chia hết cho 2 và 3");
		nhapTuBanPhim.close();
	}
}

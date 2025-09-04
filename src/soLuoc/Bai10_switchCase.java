package soLuoc;

import java.util.Scanner;

public class Bai10_switchCase {
	public static boolean kiemTraNamNhuan(int nam) {
		if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int thang = 0, nam;

		Scanner nhapTuBanPhim = new Scanner(System.in);
		try {
			System.out.print("Nhập tháng: ");
			thang = nhapTuBanPhim.nextInt();
		} catch (Exception e) {
			System.out.println("Dữ liệu không hợp lệ");
		}

		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println(thang + " có 31 ngày");
			break;
		}
		case 2: {
			System.out.print("Nhập năm: ");
			nam = nhapTuBanPhim.nextInt();
			if (kiemTraNamNhuan(nam))
				System.out.println(thang + " có 29 ngày");
			else
				System.out.println(thang + " có 28 ngày");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			System.out.println(thang + " có 30 ngày");
			break;
		}
		default:
			System.out.println("Không có tháng " + thang + " trong năm");
		}
		nhapTuBanPhim.close();
	}
}

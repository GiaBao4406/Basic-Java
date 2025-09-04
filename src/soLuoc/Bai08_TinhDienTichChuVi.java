package soLuoc;

import java.util.Locale;
import java.util.Scanner;

public class Bai08_TinhDienTichChuVi {
	public static void main(String[] args) {
		// tính chu vi diện tích hình tròn
		// S = PI * R * R
		// CV = PI * R * 2
		// CV = PI * D
		
		float D,R;
		double Pi = Math.PI;
		Locale.setDefault(Locale.US);
		Scanner nhapTuBanPhim = new Scanner(System.in);
		
		System.out.print("Nhập Đường Kính: ");
		D = nhapTuBanPhim.nextFloat();
		
		R = D/2;
		
		// tính diện tích
		float dt = (float) Pi * (float) Math.pow(R, 2); // dt = Math.Pi * R * R;
		
		// Tính Chu Vi
		float cv = (float) Pi * (float) D;
		
		System.out.println("Diện tích hình tròn: " +dt);
		System.out.println("Chu vi hình tròn: "+cv);
		
		System.out.println("Diện tích hình tròn đã làm tròn tới thập phân thứ 2: " +Math.round(dt*100.0)/100.0);
		System.out.printf("Chu vi hình tròn đã làm tròn tới thập phân thứ 2: %.2f",cv);
		
		nhapTuBanPhim.close();
	}
}

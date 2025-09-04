package soLuoc;

import java.util.Locale;
import java.util.Scanner;

public class Bai07_CacHamToanHoc {
	public static void main(String[] args) {
		double a, b;
		Locale.setDefault(Locale.US);
		
		Scanner nhapTuBanPhim = new Scanner(System.in);
				
		System.out.print("Nhập a: ");
		a = nhapTuBanPhim.nextDouble();
		
		System.out.print("Nhập b: ");
		b = nhapTuBanPhim.nextDouble();
		
		// Trị tuyệt đối
		double triTuyetDoiCuaA = Math.abs(a);
		
		// Tìm max
		double max = Math.max(a, b);
		
		// Tìm min
		double min = Math.min(a, b);
		
		// Hàm mủ
		double mu2CuaA = Math.pow(a, 2);
		double mu3CuaA = Math.pow(b, 3);
		
		// Hàm căn bậc 2
		double canBac2CuaA = Math.sqrt(a);
		
		// Hàm căn bậc 3 
		double canBac3CuaA = Math.cbrt(a);
		
		// Giá trị của PI
		double PI = Math.PI;
		
		// Làm tròn sẽ trả về SỐ NGUYÊN
		double lamTron = Math.round(a);
		
		System.out.println("Trị tuyệt đối của A = "+triTuyetDoiCuaA);
		System.out.println("MAX = "+max);
		System.out.println("MIN = "+min);
		System.out.println("A bình phương = "+mu2CuaA);
		System.out.println("A^3 = "+mu3CuaA);
		System.out.println("Căn bậc 2 của A = "+canBac2CuaA);
		System.out.println("Căn bậc 3 của A  = "+canBac3CuaA);
		System.out.println("Số pi  = " +PI);
		System.out.println("Số A đã làm tròn  = " +lamTron);
		nhapTuBanPhim.close();
	}
	
	
}

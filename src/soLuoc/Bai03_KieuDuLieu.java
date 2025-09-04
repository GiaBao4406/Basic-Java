package soLuoc;

public class Bai03_KieuDuLieu {
	public static void main(String[] args) {
		String tenSach = "Lập trình Java";
		int namXuatBan = 2025;
		// Khai báo biến và gán biến số thực thì nhập dấu . còn nhập từ bàn phím thì dấu ,
		double giaBan = 15.5;
		boolean conSach = true;
		char maKho = 'M';
		
		System.out.println("Tên sách: " +tenSach);
		System.out.println("Năm: " +namXuatBan);
		System.out.print("Giá tiền: "+giaBan*2.5);
		System.out.println("$");
		System.out.println("Còn sách: "+conSach);
		System.out.println("Mã Kho: "+maKho);
	}
}

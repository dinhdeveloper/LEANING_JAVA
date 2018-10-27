package khacnguyen;

import java.util.Date;
import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {

	private double thangCongTac;
	
	public GiangVienThinhGiang() {
		super();
	}
	
	public GiangVienThinhGiang(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String thuDT,
			String dienThoai, String maGV, String tenKhoa, int soTietDay, double tienMotTiet, double thangCongTac) {
		super(hoTen, diaChi, ngaySinh, gioiTinh, thuDT, dienThoai, maGV, tenKhoa, soTietDay, tienMotTiet);
		this.thangCongTac = thangCongTac;
	}

	public double getThangCongTac() {
		return thangCongTac;
	}

	public void setThangCongTac(double thangCongTac) {
		this.thangCongTac = thangCongTac;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thang cong tac");
		thangCongTac = sc.nextDouble();
	}
	@Override
	public void xuat() {
		System.out.println(this.toString());
	}
	@Override
	public double tinhPhuCap() {
		return super.tinhLuong() + thangCongTac * 5000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" 
				+ "GiangVienThinhGiang [thangCongTac=" + thangCongTac + "]";
	}
	
	public static void main(String[] args) {
		GiangVienThinhGiang giang = new GiangVienThinhGiang();
		giang.nhap();
		giang.xuat();
	}
}

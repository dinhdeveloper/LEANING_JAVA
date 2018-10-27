package khacnguyen;

import java.util.Date;
import java.util.Scanner;

public abstract class GiangVien extends ConNguoi {
	private String maGV;
	private String tenKhoa;
	private int soTietDay;
	private double tienMotTiet;
	
	public GiangVien() {
		super();
	}
	
	public GiangVien(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String thuDT, String dienThoai,
			String maGV, String tenKhoa, int soTietDay, double tienMotTiet) {
		super(hoTen, diaChi, ngaySinh, gioiTinh, thuDT, dienThoai);
		this.maGV = maGV;
		this.tenKhoa = tenKhoa;
		this.soTietDay = soTietDay;
		this.tienMotTiet = tienMotTiet;
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public double getTienMotTiet() {
		return tienMotTiet;
	}

	public void setTienMotTiet(double tienMotTiet) {
		this.tienMotTiet = tienMotTiet;
	}

	@Override
	public void nhap() {
		super.nhap();
		Scanner  sc= new Scanner(System.in);
		System.out.println("nhap ma giang vien");
		maGV= sc.nextLine();
		System.out.println("nhap ten khoa");
		tenKhoa =  sc.nextLine();
		System.out.println("nhap so tiet");
		soTietDay = sc.nextInt();
		System.out.println("nhap so tien mot tiet");
		tienMotTiet = sc.nextDouble();
	}
	
	@Override
	public void xuat() {
		System.out.println(this.toString());
	}
	
	public double tinhLuong() {
		return soTietDay * tienMotTiet;
	}
	
	public abstract double tinhPhuCap();
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "GiangVien [maGV=" + maGV + ", tenKhoa=" + tenKhoa + ", soTietDay=" + soTietDay + ", tienMotTiet="
				+ tienMotTiet + "]";
	}	
}

package khacnguyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConNguoi {
	private String hoTen;
	private String diaChi;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String thuDT;
	private String dienThoai;
	
	public ConNguoi() {}
	
	public ConNguoi(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String thuDT, String dienThoai) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.thuDT = thuDT;
		this.dienThoai = dienThoai;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getThuDT() {
		return thuDT;
	}

	public void setThuDT(String thuDT) {
		this.thuDT = thuDT;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten:");
		hoTen= sc.nextLine();
		System.out.println("nhap dia chi");
		diaChi = sc.nextLine();
		
		System.out.println("nhap ngay sinh");
		try {
			ngaySinh = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
		System.out.println("nhap gioi tinh");
		gioiTinh = sc.nextBoolean();
		sc.nextLine();
		System.out.println("nhap thu dien tu");
		thuDT = sc.nextLine();
		System.out.println("nhap so dien thoai");
		dienThoai= sc.nextLine();
		
	}

	public void xuat() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "ConNguoi [hoTen=" + hoTen + ", diaChi=" + diaChi + ", ngaySinh=" 
				+ new SimpleDateFormat("yyyy-MM-dd").format(ngaySinh) 
				+ ", gioiTinh=" + (gioiTinh?"male":"female")
				+ ", thuDT=" + thuDT + ", dienThoai=" + dienThoai + "]";
	}	
}

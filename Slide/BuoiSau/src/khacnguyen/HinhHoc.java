package khacnguyen;

import java.util.Scanner;

public abstract class HinhHoc {

	private String tenHinh;

	public HinhHoc() {}
	
	public HinhHoc(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	public void nhapHinh() {
		System.out.println("vui long nhap hinh");
		Scanner sc = new Scanner(System.in);
		tenHinh = sc.nextLine();
	}
	
	public void xuatHinh() {
		System.out.println(this.toString());
	}
	
	public abstract void tinhChuVi();
	
	public abstract void tinhDienTich();
	
	@Override
	public String toString() {
		return "HinhHoc [tenHinh=" + tenHinh + "]";
	}
}

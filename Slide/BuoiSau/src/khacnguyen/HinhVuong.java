package khacnguyen;

import java.util.Scanner;

public class HinhVuong extends HinhHoc {

	private int a;
	
	public HinhVuong() {
		super();
	}

	public HinhVuong(int a) {
		super();
		this.a=a;
	}

	public HinhVuong(String tenHinh, int a) {
		super(tenHinh);
		this.a=a;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public void nhapHinh() {
		super.nhapHinh();
		System.out.println("nhap canh hinh vuong");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
	}
	
	@Override
	public void xuatHinh() {
		System.out.println(this.toString());
	}
	
	@Override
	public void tinhChuVi() {
		System.out.println("chu vi hinh vuong = " + (a*4));
	}

	@Override
	public void tinhDienTich() {
		System.out.println("dien tich hinh vuong = " + (a*a));
	}

	@Override
	public String toString() {
		return "HinhVuong [a=" + a + "]";
	}
	
}

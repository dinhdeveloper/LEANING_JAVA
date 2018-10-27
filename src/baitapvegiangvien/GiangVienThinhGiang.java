package baitapvegiangvien;

import java.util.Date;
import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private double thangCongTac;

    public double getThangCongTac() {
        return thangCongTac;
    }

    public void setThangCongTac(double thangCongTac) {
        this.thangCongTac = thangCongTac;
    }

    public GiangVienThinhGiang() {
        super();
    }

    public GiangVienThinhGiang(double thangCongTac, String maGiangVien, String tenKhoa, int soTietDay, double tienMotTiet, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String soDienThoai) {
        super(maGiangVien, tenKhoa, soTietDay, tienMotTiet, hoTen, diaChi, ngaySinh, gioiTinh, email, soDienThoai);
        this.thangCongTac = thangCongTac;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập Tháng Công Tác: ");
        thangCongTac = in.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Tháng Công Tác: " + getThangCongTac());
    }

    @Override
    public double TienPhuCap() {
        return super.tinhLuong() + thangCongTac * 5000;
    }

    public static void main(String[] args) {
        GiangVienThinhGiang giang = new GiangVienThinhGiang();
        giang.Nhap();
        giang.Xuat();
    }
}

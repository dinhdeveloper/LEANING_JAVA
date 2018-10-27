package baitapvegiangvien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiangVien extends ConNguoi {

    //Thuộc tính giảng viên
    private String maGiangVien;
    private String tenKhoa;
    private int soTietDay;
    private double tienMotTiet;

    public GiangVien() {

    }

    //kế thừa thằng cha.
    public GiangVien(String maGiangVien, String tenKhoa, int soTietDay, double tienMotTiet, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String soDienThoai) {
        super(hoTen, diaChi, ngaySinh, gioiTinh, email, soDienThoai);
        this.maGiangVien = maGiangVien;
        this.tenKhoa = tenKhoa;
        this.soTietDay = soTietDay;
        this.tienMotTiet = tienMotTiet;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public double getTienMotTiet() {
        return tienMotTiet;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public void setTienMotTiet(double tienMotTiet) {
        this.tienMotTiet = tienMotTiet;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập Mã Giảng Viên: ");
        maGiangVien = in.nextLine();
        System.out.println("");
        System.out.print("Nhập tên khoa: ");
        tenKhoa = in.nextLine();
        System.out.println("");
        System.out.print("Nhập số tiết dạy: ");
        soTietDay = in.nextInt();
        System.out.println("");
        System.out.print("Nhập tiền 1 tiết: ");
        tienMotTiet = in.nextDouble();
        System.out.println("");
    }

    public double tinhLuong() {
        return soTietDay * tienMotTiet;
    }

    //tự cho tiền phụ cấp là 500 000 đồng;
    public abstract double TienPhuCap();

    @Override
    public void Xuat() {
        System.out.println("==========THÔNG TIN GIẢNG VIÊN==========");
        System.out.println("Họ Tên: " + getHoTen());
        System.out.println("Địa Chỉ: " + getDiaChi());
        System.out.println("Ngày Sinh(yyyy-MM-dd): " + new SimpleDateFormat("yyyy-MM-dd").format(getNgaySinh()));
        System.out.println("Giới Tính: " + (isGioiTinh() ? "Nam" : "Nữ"));
        System.out.println("Email: " + getEmail());
        System.out.println("Số Điện Thoại: " + getSoDienThoai());
        System.out.println("Mã Giảng Viên: " + getMaGiangVien());
        System.out.println("Tên Khoa: " + getTenKhoa());
        System.out.println("Số Tiết Dạy Của Giảng Viên: " + getSoTietDay());
        System.out.println("Tiền 1 Tiết: " + getTienMotTiet() + " VNĐ");
        System.out.println("Tiền Phụ Cấp: " + TienPhuCap());
        System.out.println("Tiền Lương: " + tinhLuong());
    }
}


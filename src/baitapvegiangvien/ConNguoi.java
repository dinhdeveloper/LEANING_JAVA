package baitapvegiangvien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConNguoi {
    //thuộc tính con người:
    private String hoTen;
    private String diaChi;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String email;
    private String soDienThoai;

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String soDienThoai) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------Nhập Thông Tin----------");
        System.out.print("Nhập Họ Tên: ");
        hoTen = in.nextLine();
        System.out.println("");
        System.out.print("Nhập địa chỉ: ");
        diaChi = in.nextLine();
        System.out.println("");
        System.out.print("Nhập ngày sinh: ");
        String ngay = in.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //không nên tạo đối tượng dùng 1 lần vì nó rất nặng.
        //nên hãy dùng cách này:
        //ngaySinh = new SimpleDateFormat("yyyy-MM-dd").parse(ngay);
        try {
            ngaySinh = format.parse(ngay);
        } catch (Exception ex) {
            System.out.println("Bị lổi" + ex.getMessage());
        }
        System.out.println("");
        System.out.print("Nhập giới tính: ");
        gioiTinh = in.nextBoolean();
        in.nextLine();
        System.out.println("");
        System.out.print("Nhập email: ");
        email = in.nextLine();
        System.out.println("");
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = in.nextLine();
        System.out.println("");
    }

    public void Xuat() {
        System.out.println("==========THÔNG TINH GIẢNG VIÊN==========");
        System.out.println("Họ Tên: " + getHoTen());
        System.out.println("Địa Chỉ: " + getDiaChi());
        System.out.println("Ngày Sinh: " + new SimpleDateFormat("yyyy-MM-dd").format(getNgaySinh()));
        System.out.println("Giới Tính: " + (isGioiTinh()?"Nam":"Nữ"));
        System.out.println("Email: " + getEmail());
        System.out.println("Số Điện Thoại: " + getSoDienThoai());
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        ConNguoi connguoi = new ConNguoi();
        connguoi.Nhap();
        connguoi.Xuat();
    }
}

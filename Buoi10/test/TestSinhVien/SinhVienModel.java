package TestSinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class SinhVienModel {
    List<SinhVien> list = new ArrayList<>();
    public void nhap(){
        Scanner in = new Scanner(System.in);
        int soLuong;
        System.out.print("Nhập Số Lượng Sinh Viên: ");
        soLuong = in.nextInt();
        for (int i = 0; i < soLuong; i++){
            SinhVien sv = new SinhVien();
            System.out.println("NHẬP THÔNG TIN SINH VIÊN");
            System.out.print("Nhập ID Sinh Viên Thứ " + (i + 1) + ": ");
            sv.setId(in.nextInt());
            in.nextLine();
            System.out.println("");
            System.out.print("Nhập Tên Sinh Viên Thứ " + (i + 1) + ": ");
            sv.setName(in.nextLine());
            System.out.println("");

            list.add(sv);
        }
    }
    public void xuat() {
        for (SinhVien stu : list) {
            System.out.println("Mã Số Sinh Viên: " + stu.getId());
            System.out.println("Tên Sinh Viên: " + stu.getName());
        }
    }
}

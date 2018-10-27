package DAO;

import Model.Person;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class PersonDAO {

    List<Person> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int soLuong;
        System.out.print("Nhập Số Lượng Học Sinh: ");
        soLuong = sc.nextInt();
        for (int i = 0; i <= soLuong; i++) {
            Person ps = new Person();
            System.out.println("NHẬP THÔNG TIN HỌC SINH");
            System.out.print("Nhập Họ Tên Học Sinh Thứ " + i + 1 + ": ");
            ps.setName(sc.nextLine());
            System.out.println("");
            System.out.print("Nhập Địa Chỉ: ");
            ps.setAddress(sc.nextLine());
            System.out.println("");
            System.out.print("Nhập Ngày Sinh(dd-MM-yyyy): ");
            String ngay = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            try {
                //ps.setBirthday() = format.parse(ngay);
            } catch (Exception ex) {
                System.out.println("Bị lổi" + ex.getMessage());
            }

            list.add(ps);
        }
    }
}

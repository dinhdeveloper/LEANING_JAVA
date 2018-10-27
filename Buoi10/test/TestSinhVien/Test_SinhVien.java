package TestSinhVien;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class Test_SinhVien implements Serializable{

    List<Test_SinhVien> list = new ArrayList<>();
    private String name;

    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test_SinhVien() {
    }

    public Test_SinhVien(String name) {
        this.name = name;
    }

    public void nhap() {
        System.out.print("Nhập Số Lượng Sinh Viên: ");
        int soLuong;
        soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            Test_SinhVien testSV = new Test_SinhVien();
            System.out.println("SINH VIÊN");
            System.out.print("Nhập tên SV thứ " + (i + 1) + ": ");
            testSV.setName(sc.nextLine());
            list.add(testSV);
        }
    }

    public void xuat() {
        for (Test_SinhVien stu : list) {
            System.out.println("Họ Tên Sinh Viên: " + stu.getName());
        }
    }

    public void ListWrite(List<Test_SinhVien> list) {
        ObjectOutputStream stream = null;
        try {
            FileOutputStream st = new FileOutputStream("D:/Test_SinhVien.dat");
            stream = new ObjectOutputStream(st);
            stream.writeObject(list.add(this));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void ListRead() {
        try {
            ObjectInputStream stream = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:/Test_SinhVien.dat")));
            Object readObject = stream.readObject();
            Test_SinhVien sv = (Test_SinhVien) readObject;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException x) {
            System.out.println(x.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Test_SinhVien> list = new ArrayList<>();
        Test_SinhVien test_SV = new Test_SinhVien();
        test_SV.nhap();
        //test_SV.xuat();
        list.add(test_SV);
        test_SV.ListWrite(list);
        //test_SV.ListRead();
    }
}

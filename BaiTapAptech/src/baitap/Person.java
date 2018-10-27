package baitap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class Person {
    private String name;
    private String address;
    private Date birthday;
    
    List<Person> list = new ArrayList<>();
    
    public Person(){
        
    }
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        int soLuong;
        System.out.print("Nhập Số Lượng Học Sinh: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <= soLuong; i++) {
            Person ps = new Person();
            System.out.println("NHẬP THÔNG TIN HỌC SINH");
            System.out.print("Nhập Họ Tên Học Sinh Thứ " + (i + 1) + ": ");
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
    public void xuat(){
        System.out.println("THÔNG TIN HỌC SINH");
        for (Person stu : list) {
            System.out.println("Họ Và Tên: " + stu.getName());
            System.out.println("Địa Chỉ: " + stu.getAddress());
            System.out.println("Ngày Sinh: " + new SimpleDateFormat("dd-MM-yyyy").format(stu.getBirthday()));
        }
//        System.out.println("Họ Và Tên: "+getName());
//        System.out.println("Địa Chỉ: "+getAddress());
//        System.out.println("Ngày Sinh: " + new SimpleDateFormat("dd-MM-yyyy").format(getBirthday()));
    }
    public static void main(String[] args) {
        Person person = new  Person();
        person.nhap();
        person.xuat();
    }
}

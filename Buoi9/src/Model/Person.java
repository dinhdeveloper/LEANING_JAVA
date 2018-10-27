package Model;

/**
 *
 * @author Dinht
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class Person {
    private String name;
    private String address;
    private Date birthday;
    
    
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
        System.out.println("NHẬP THÔNG TIN HỌC SINH");
        System.out.print("Nhập tên học sinh: ");
        name = sc.nextLine();
        System.out.println("");
        System.out.print("Nhập địa chỉ học sinh: ");
        address = sc.nextLine();
        System.out.println("");
        System.out.print("Nhập ngày sinh(dd-MM-yyyy): ");
        String ngay = sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            birthday = format.parse(ngay);
        } catch (Exception ex) {
            System.out.println("Bị lổi" + ex.getMessage());
        }
    }
    public void xuat(){
        System.out.println("THÔNG TIN HỌC SINH");
        System.out.println("Họ Và Tên: "+getName());
        System.out.println("Địa Chỉ: "+getAddress());
        System.out.println("Ngày Sinh: " + new SimpleDateFormat("dd-MM-yyyy").format(getBirthday()));
    }
    public static void main(String[] args) {
        Person person = new  Person();
        person.nhap();
        person.xuat();
    }
}

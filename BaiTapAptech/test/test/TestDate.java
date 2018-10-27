package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class TestDate {

    public Date birthday;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nhập ngày: ");
        String ngay = sc.nextLine();
        try {
            birthday = format.parse(ngay);
        } catch (Exception ex) {
            System.out.println("Bị lổi" + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
    }
}

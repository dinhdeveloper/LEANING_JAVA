package baitap;

import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class Staff extends Person {

    Scanner sc = new Scanner(System.in);
    private String school;
    private double pay;

    public Staff() {

    }

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void kiemtraPay() {
        System.out.print("Nhập tiền: ");
        pay = sc.nextDouble();
        if (5000 <= pay || pay <= 10000) {
            System.out.print("Nhập lại tiền: ");
            pay = sc.nextDouble();
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        kiemtraPay();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tiền là: " + getPay());
    }
}

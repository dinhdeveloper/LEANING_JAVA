package baitap;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author Dinht
 */
public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    Scanner sc = new Scanner(System.in);

    public Student() {

    }

    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("");
        System.out.print("Nhập chương trình học: ");
        program = sc.nextLine();
        System.out.println("");
        System.out.print("Nhập năm học: ");
        year = sc.nextInt();
        System.out.println("");
        kiemTraHocPhi();
        System.out.println("");
    }

    public void kiemTraHocPhi() {
        System.out.print("Nhập học phí: ");
        fee = sc.nextDouble();
        if (fee < 0) {
            System.out.print("Nhập lại học phí(học phí < 0): ");
            fee = sc.nextDouble();
        }
    }

    public void kiemTraNamSinh() {

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chương Trình Học: " + getProgram());
        System.out.println("Năm Học: " + getYear());
        System.out.println("Học Phí: " + getFee());
    }
}

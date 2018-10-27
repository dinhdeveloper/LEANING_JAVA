package khacnguyen;

import java.nio.channels.SocketChannel;
import java.util.*;

public class Animal {
	
	private String ten;
	private int soChan;
	
	
	public Animal() {}
	
	public Animal(String ten, int soChan) {
		super();
		this.ten = ten;
		this.soChan = soChan;
	}

	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getSoChan() {
		return soChan;
	}
	
	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}
	
	public void move() {
		
	}
	
	public void bark() {
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten animal");
		ten= sc.nextLine();
		
		do {
			System.out.println("nhap vao so chan");
			while(!sc.hasNextInt()) {
				System.out.println("vui long nhap lai so chan phai la con so");
				sc.nextLine();
			}
			soChan = sc.nextInt();
			if(soChan<0) {
				System.out.println("vui long nhap so chan phai lon hon 0");
			}
		}while(soChan<0);
		
	}
	
	public void xuat() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Animal [ten=" + ten + ", soChan=" + soChan + "]";
	}	
}

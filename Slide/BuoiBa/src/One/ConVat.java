package One;

import java.util.*;

public class ConVat {

	public String ten;
	protected int tuoi;
	boolean gioitinh; //nomodifier
	private Date ngaysinh;
	
	public static void main(String[] args) {
		
		 ConVat cv = new ConVat();
		 cv.ten="nguyen";
		 cv.tuoi=35;
		 cv.gioitinh = true;
		 cv.ngaysinh= new Date();

	}

}

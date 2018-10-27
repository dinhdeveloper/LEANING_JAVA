package baihoc;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// <?> day al generic 
		List<Student> list = new ArrayList<Student>();
		
		Student st1 = new Student(1, "nguyen");
		Student st2 = new Student(2, "duy");
		Student st3 = new Student(3, "duong");
		Student st4 = new Student(4, "anh");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
//		//duyet qua list bang for can ban
//		for (int i = 0; i < list.size(); i++) {
////			System.out.print(list.get(i).getId() +" ");
////			System.out.println(list.get(i).getName());
//			System.out.println(list.get(i));
//		}
		
		//foreach, voi mỗi một phần tử trong list
		for (Student stu : list) {
			System.out.println(stu.getName());
			//System.out.println(stu);
		}
		
		//duyet qua luon bang list => java 8
		list.forEach(System.out::println);
		
		list.forEach(
				stu -> {
					System.out.println(stu.getName());
					System.out.println(stu.getId());
				}
		);
		
		//tim kiem
		for (Student stu : list) {
			if(stu.getName().equals("nguyen")) {
				System.out.println(stu);
			}
		}
			
		//jdk 8 
		list.forEach(stu -> {
			if(stu.getName().equals("nguyen")) {
				System.out.println(stu);
			}
		});
		
		list.stream()
			.filter(x->x.getName().equals("nguyen"))
			.forEach(System.out::println);
	}

}

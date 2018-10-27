package view;

import DAO.StudentDAO;
import entity.Student;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "khac nguyen"));
		list.add(new Student(102, "truong nguyen"));
		list.add(new Student(103, "phuong"));
		list.add(new Student(104, "toan"));
		
		StudentDAO dao = new StudentDAO();
		dao.writeListStudent(list);
		dao.readListStudent();
	}

}

package DAO;

import entity.Student;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Dinht
 */
public class StudentDAO {

    public void writeStudent(Student stu) {
        try (
                ObjectOutputStream stream = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("d:/student.txt")
                        )
                )) {
            stream.writeObject(stu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readStudent() {
        try (
                ObjectInputStream stream = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("d:/student.txt")
                        )
                )) {
            Student stu = (Student) stream.readObject();
            System.out.println(stu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeListStudent(List<Student> list) {
        try (
                ObjectOutputStream stream = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("d:/student.txt")
                        )
                )) {
            stream.writeObject(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readListStudent() {
        try (
                ObjectInputStream stream = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("d:/student.txt")
                        )
                )) {
            List<Student> list = (List<Student>) stream.readObject();
            list.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

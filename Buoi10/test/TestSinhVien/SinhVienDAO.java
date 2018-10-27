package TestSinhVien;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Dinht
 */
public class SinhVienDAO {

    public void writeListSinhVien(List<SinhVien> list) {
        try {
            ObjectOutputStream stream = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("D:/sinhvienDAO.dat")));
            stream.writeObject(list);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void readListSinhVien() {
        try {
            ObjectInputStream stream = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:/sinhvienDAO.dat")));
            List<SinhVien> list = (List<SinhVien>) stream.readObject();
            list.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException x) {
            System.out.println(x.getMessage());
        }
    }
}

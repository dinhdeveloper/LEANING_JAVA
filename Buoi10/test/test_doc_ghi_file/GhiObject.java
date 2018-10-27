package test_doc_ghi_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class GhiObject {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.setMa(001);
        sv.setTen("Dinh");
        try {
            ObjectOutputStream stream = new ObjectOutputStream(
                    new FileOutputStream("D:/SinhVien.dat"));
            stream.writeObject(sv);
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
}

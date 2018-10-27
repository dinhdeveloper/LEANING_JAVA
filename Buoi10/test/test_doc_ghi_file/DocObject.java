package test_doc_ghi_file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class DocObject {
    public static void main(String[] args) {
        try {
            ObjectInputStream ios = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:/SinhVien.dat")));
            Object readObject = ios.readObject();
            SinhVien sv = (SinhVien) readObject;
            System.out.println(sv);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(DocObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

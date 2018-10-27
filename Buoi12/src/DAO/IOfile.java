package DAO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Dinht
 */
public class IOfile {
    public void writeListProduct(List<Product> list){
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("D:/Product.dat")));
            stream.writeObject(list);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void readListProduct(){
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:/Product.dat")));
            List<Product> list = (List<Product>) stream.readObject();
            list.forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

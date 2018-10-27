package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class DemoBufferWiter {
    //cách ghi file theo từng dòng:
    public static void main(String[] args) {
       FileWriter fw = null;
        try {
            fw = new FileWriter("D:/Demo.dat",true);
            BufferedWriter writer = new BufferedWriter(fw);
            System.out.println("Nhap cac dong: ");
            for (int i = 0; i < 3; i++) {
                Scanner sc = new Scanner(System.in);
                String s;
                s = sc.nextLine();
                writer.write(s);
                writer.newLine();// chia cac dong thanh dong moi
            }
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(DemoBufferWiter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoBufferWiter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

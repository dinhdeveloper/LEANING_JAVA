package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class ReadFile {

    public static void main(String[] args) {
        FileInputStream fileOut = null;
        try {
            fileOut = new FileInputStream("D:/Demo.dat");
            while (true) {
                int read = fileOut.read();
//                cach 1:
//                System.out.println(read);
//                if (fileOut.available() == 0) {
//                    break;
//                }
//                cach 2:
                if(read == -1){
                    break;
                }
                System.out.println((char)read);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOut.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

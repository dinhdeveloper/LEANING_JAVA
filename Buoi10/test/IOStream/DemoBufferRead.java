package IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class DemoBufferRead {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader( new FileReader("D:/Demo.dat"));
            while (true) {                
                String readLine = reader.readLine();
                if(readLine == null){
                    break;
                }
                System.out.println(readLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoBufferRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoBufferRead.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoBufferRead.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

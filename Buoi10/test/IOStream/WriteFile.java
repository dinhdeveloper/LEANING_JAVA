package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinht
 */
public class WriteFile {

    public static void main(String[] args) {
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("D:/Demo.dat", true);
            Scanner sc = new Scanner(System.in);
            String s;
            System.out.print("Nhap du lieu can ghi: ");
            s = sc.nextLine();
            fileOut.write(s.getBytes()); //in ra mang byte
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOut.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*Khối finally trong là một khối được sử dụng để thực thi các phần code quan 
            trọng như đóng kết nối, đóng stream, … Khối finally luôn luôn được thực
            thi dù cho exception có được xử lý hay không. Khối finally phải được theo
            sau bởi khối try hoặc khối catch .*/
                        }
            }
        }

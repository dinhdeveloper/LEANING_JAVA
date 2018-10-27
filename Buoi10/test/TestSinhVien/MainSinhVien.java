package TestSinhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dinht
 */
public class MainSinhVien {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        SinhVienModel svModel = new SinhVienModel();
        svModel.nhap();
        //svModel.xuat();
        
        SinhVienDAO svDAO = new SinhVienDAO();
        svDAO.writeListSinhVien(list);
        svDAO.readListSinhVien();
    }
}

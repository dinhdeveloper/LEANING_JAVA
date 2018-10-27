package view;

import DAO.IOfile;
import DAO.ProductDAO;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Dinht
 */
public class RunMain {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        ProductDAO dao = new ProductDAO();
        dao.Nhap();
        dao.Xuat();
        IOfile io = new IOfile();
        io.writeListProduct(list);
        io.readListProduct();
    }
}

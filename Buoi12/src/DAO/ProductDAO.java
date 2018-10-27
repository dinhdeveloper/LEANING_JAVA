package DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Dinht
 */
public class ProductDAO {

    List<Product> list = new ArrayList<>();

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        int soLuong;
        System.out.print("Nhập Số Lượng Sản Phẩm : ");
        soLuong = in.nextInt();
        in.nextLine();
        System.out.println("");
        for (int i = 0; i < soLuong; i++) {
            Product product = new Product();
            System.out.print("Nhập Mã Sản Phẩm: ");
            try {
                product.setMaSanPham(Integer.parseInt(in.nextLine()));
            } catch (Exception e) {
                System.out.print("Nhập lại Mã Sản Phẩm(Nhập Số): ");    
            }
            in.nextLine();
            System.out.println("");
            System.out.print("Nhập Tên Sản Phẩm: ");
            product.setTenSanPham(in.nextLine());
            System.out.println("");
            System.out.print("Nhập Tình Trạng Sản Phẩm: ");
            product.setTinhTrang(in.nextBoolean());
            in.nextLine();
            System.out.println("");
            System.out.print("Nhập Ngày Sản Xuất: ");
            String ngay = in.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            try {
                product.setNgaySanXuat(format.parse(ngay));
            } catch (Exception ex) {
                System.out.println("Bị lổi" + ex.getMessage());
            }
            System.out.println("");
            System.out.print("Nhập Số Lượng Sản Phẩm: ");
            try {
                product.setSoLuongSP(Integer.parseInt(in.nextLine()));
            } catch (Exception e) {
                System.out.print("Nhập lại Số Lượng Sản Phẩm(Nhập Số): ");    
            }
            System.out.println("");

            list.add(product);
        }
    }

    public void Xuat() {
        for (Product stu : list) {
            System.out.println("Mã Sản Phẩm: " + stu.getMaSanPham());
            System.out.println("Tên Sản Phẩm: " + stu.getTenSanPham());
            System.out.println("Tình Trạng: " + (stu.isTinhTrang()? "Còn Hàng" : "Hết Hàng"));
            System.out.println("Ngày Sản Xuất: " + new SimpleDateFormat("dd-MM-yyyy").format(stu.getNgaySanXuat()));
            System.out.println("Số Lượng SP: " + stu.getSoLuongSP());
        }
    }
}

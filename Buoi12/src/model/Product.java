package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dinht
 */
public class Product implements Serializable{
    private int maSanPham;
    private String tenSanPham;
    private boolean tinhTrang;
    private Date ngaySanXuat;
    private int soLuongSP;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, boolean tinhTrang, Date ngaySanXuat, int soLuongSP) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tinhTrang = tinhTrang;
        this.ngaySanXuat = ngaySanXuat;
        this.soLuongSP = soLuongSP;
    }

    

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }
    

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }
    
    
}

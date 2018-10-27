package test_doc_ghi_file;

import java.io.Serializable;

/**
 *
 * @author Dinht
 */
public class SinhVien implements Serializable{
    private int ma;
    private String ten;

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public SinhVien() {
    }

    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + '}';
    }
    
}

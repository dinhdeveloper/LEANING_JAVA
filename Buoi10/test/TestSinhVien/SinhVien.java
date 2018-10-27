package TestSinhVien;

import java.io.Serializable;

/**
 *
 * @author Dinht
 */
public class SinhVien implements Serializable{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SinhVien() {
    }

    public SinhVien(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}

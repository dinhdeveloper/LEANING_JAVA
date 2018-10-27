package baitapvegiangvien;

public class GiangVienChinhThuc extends GiangVien {

    private double tienPhuCap;


    public double getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap(double tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    @Override
    public double TienPhuCap() {
        return 0;
    }
}
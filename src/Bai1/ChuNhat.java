package Bai1;

public class ChuNhat {
    private double chieuDai;
    private double chieuRong;

    public ChuNhat() {
    }

    public ChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }
    public void xuat() {
        System.out.println("Chu vi : " + chuVi() + "\t" + "Dien tich: " + dienTich());
    }
}

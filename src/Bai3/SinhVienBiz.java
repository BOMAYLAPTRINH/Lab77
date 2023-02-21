package Bai3;

import Bai2.SinhVienPoly;

public class SinhVienBiz extends SinhVienPoly {

    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

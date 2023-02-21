package Bai1;

public class Vuong extends ChuNhat{
    public Vuong() {
    }
    public Vuong(double chieuDai) {
        super(chieuDai, chieuDai);
    }
    @Override
    public void xuat() {
        System.out.println("Chu vi : " + chuVi() + "\t" + "Dien tich: " + dienTich());
    }

}

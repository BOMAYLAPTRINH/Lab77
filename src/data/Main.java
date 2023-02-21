package data;

import Bai2.SinhVienPoly;
import com.QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int chon;
        QLSV x = new QLSV();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("0 Thoát");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    x.add();
                    break;
                case 2:
                    x.paint();
                    break;
                case 3:
                    x.xuatGioi();
                    break;
                case 4:
                    x.sapXep();
                    break;
                case 0:
                    return;
            }
        }
    }
}

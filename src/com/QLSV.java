package com;

import Bai2.SinhVienPoly;
import Bai3.SinhVienIT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVienPoly> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void add() {

        String name;
        String nghanh;
        double diem;

        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập nghành sinh viên: ");
        nghanh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diem = Double.parseDouble(sc.nextLine());
        list.add(new SinhVienPoly(name,nghanh) {
        @Override
        public double getDiem() {
            return diem;
        }
    });
    }
    public void paint() {
        for (SinhVienPoly x : list) {
            x.xuat();
        }
    }
    public void xuatGioi() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHocLuc().equalsIgnoreCase("Giỏi"))
                list.get(i).xuat();
        }

    }
    public void sapXep() {
        list.sort(new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Double.compare(o1.getDiem(), o2.getDiem());
            }
        });
    }



}

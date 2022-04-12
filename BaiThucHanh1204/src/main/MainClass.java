package main;

import java.util.Scanner;

import shapes.HinhChuNhat; 
import shapes.HinhTron; 
import shapes.HinhTru; 
import shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn 
        HinhTron hinhTron = new HinhTron(); 
        hinhTron.xuatTen(); 
        hinhTron.nhapBanKinh(); 
        hinhTron.tinhChuVi(); 
        hinhTron.tinhDienTich(); 
        hinhTron.tinhChuVi(); 
        hinhTron.tinhDienTich();
        
        // Thử nghiệm với lớp Hình trụ 
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen(); 
        hinhTru.nhapChieuCao(); 
        hinhTru.tinhTheTich(); 
        hinhTru.inTheTich();
        // Thử nghiệm với lớp Hình chữ nhật 
        HinhChuNhat hinhChuNhat = new HinhChuNhat(); 
        hinhChuNhat.xuatTen(); 
        hinhChuNhat.nhapChieuDai(); 
        hinhChuNhat.nhapChieuRong(); 
        hinhChuNhat.tinhChuVi(); 
        hinhChuNhat.tinhDienTich(); 
        hinhChuNhat.inChuvi(); 
        hinhChuNhat.tinhDienTich();
        // Thử nghiệm với lớp Hình vuông 
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen(); 
        hinhVuong.nhapCanh(); 
        hinhVuong.tinhChuVi(); 
        hinhVuong.tinhDienTich(); 
        hinhVuong.tinhChuVi(); 
        hinhVuong.tinhDienTich();
    }  

}

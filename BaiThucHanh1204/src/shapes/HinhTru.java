package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    //Constructor
    public HinhTru() {
        ten = "Hình Trụ";
    }
    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chiều Cao =");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
        sc.close();
    }
    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}

package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai; 
    public float rong;
    
    // Constructor 
    public HinhChuNhat() {
     ten = "Hình Chữ Nhật";
    }    
    public void nhapChieuDai() {
        System.out.println("Chiều dài = "); 
        Scanner sc = new Scanner(System.in); 
        dai = sc.nextFloat();
        sc.close();
    }
    public void nhapChieuRong() {
        System.out.println("Chiều rộng = "); 
        Scanner sc = new Scanner(System.in); 
        rong = sc.nextFloat() ;
        sc.close();
    }
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
        
        
package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {

    public float bankinh;

    //Constructor
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapBankinh() {
        System.out.println("Ban kinh = ");
        Scanner scanner = new scanner(System.in);
        Bankinh = scanner.nextFloat();
    }
    pubilc void Chuvi() {
        Chuvi = 2 * PI * Bankinh;
    }
    public void Dientich() {
        Dientich = PI * Bankinh * Bankinh;
    }
}

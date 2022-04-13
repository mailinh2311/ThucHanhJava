package shapes;

import java.util.Scanner;

public class HinhTru extends HinhHoc {

    public float ChieuCao;

    //Constructor
    public HinhTru() {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        ChieuCao = scanner.nextFloat();
    }
    public void Thetich() {
        tinhDientich();
        Thetich = Dientich * ChieuCao;
    }
}

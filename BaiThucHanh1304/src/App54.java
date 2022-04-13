import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhVuong;
import Shapes.HinhTru;
public class App54 {
    public static void main(String[] args) throws Exception {
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBankinh();
        hinhTron.tinhChuvi();
        hinhTron.tinhDientich();
        hinhTron.inChuvi();
        hinhTron.inDientich();
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhThetich();
        hinhTru.inThetich();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
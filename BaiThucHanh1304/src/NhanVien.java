package model;

public class NhanVien {

    protected String ten;
    protected long luong;

    public NhanVien() {}
    public NhanVien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        //Lop con phai override de lo vu loai nhan vien nay 
        return "";

    }
    public void xuatThongTin() {
        System.out.println("==== Nhan vien: " + ten + "====");
        System.out.println("Loai nhan vien: " + loaiNhanVien());
        System.out.println("- Luong: " + luong + " VND ");
    }
}
package model;

import util.Configs;
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;
    
    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @override
    public String LoaiNhanVien() {
        return "Nhan Vien thoi vu";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}
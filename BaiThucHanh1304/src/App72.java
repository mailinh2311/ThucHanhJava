import Hinh.HinhTron;

public class App71 {
  public static void main(String[] args){
    HinhTron hinhTron = new HinhTron();
    hinhTron.setBanKinh(10);
    float Chuvi = hinhTron.tinhChuvi();
    float Dientich = hinhTron.tinhDientich();
    System.out.println("Chu vi hinh tron: " + Chuvi + "\nDien tich hinh tron: " + Dientich);
  }
}

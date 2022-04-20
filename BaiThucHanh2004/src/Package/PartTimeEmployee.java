import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    public int WorkTime;
    public void addWorkTime(){
      System.out.println("gio lam viec");
      WorkTime = sc.nextInt();
    }
    public int Luong(){
      return WorkTiem*20000;
    }
    public void LoaiNhanVien(){
      System.out.println("Loai nhan vien: Part-time employee");
    }
}
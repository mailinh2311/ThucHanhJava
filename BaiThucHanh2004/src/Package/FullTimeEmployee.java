import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    public int overtimeHours;
    public static int basicSalary = 2000000;
    public void addOvertimeHours(){
      System.out.println("Gio tang ca");
      overtimeHours = sc.nextInt();
    }
    public int Salary(){
      return overtimeHours*50000 + basicSalary;
    }
    public void LoaiNhanVien(){
      System.out.println("Loai nhan vien: Full-time employee");
    }
  }
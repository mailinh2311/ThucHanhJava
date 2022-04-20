import java.util.Scanner;

public class Employee extends Person {
    protected String position;
    public void addPosition(){
      System.out.println("Nhap nhan vien");
      position = sc.nextLine();
    }
    public void displayPosition(){
      System.out.println("Nhan vien: "+ position);
    }
}
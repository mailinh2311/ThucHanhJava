import java.util.Scanner;

public class Student extends Person {
    // Thuoc tinh
    private String StudentID; 

    public void StudentID() {
        System.out.println("nhập ID hoc sinh");
        StudentID = sc.nextLine();
    }
    public void displayStudentID(){
        System.out.println("Hoc sinh ID: "+ studentID);
    }
}

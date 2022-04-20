import java.util.Scanner;

public class Customer extends Person {
    protected String customerID;
    public void addCustomerID(){
      System.out.println("ID khac hang");
      customerID = sc.nextLine();
    }
    public void displayCustomerID(){
      System.out.println("ID khac hang: "+customerID);
    }
}
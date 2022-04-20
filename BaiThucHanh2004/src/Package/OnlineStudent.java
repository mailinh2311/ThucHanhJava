import java.util.Scanner;

public class OnlineStudent extends Student {
    public String Devices;
    public void addDevices() {
        System.out.println("Thiet bi");
        Devices = sc.nextLine();
    }
    public void displayDevices(){
        System.out.println("Thiet bi: " +Devices);
    }
    public void PlaceToStudy(){
        System.out.println("Hoc tren team");
    }
}
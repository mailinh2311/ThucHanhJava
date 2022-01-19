import java, util, scanner;
public class App{
    public static void main (String[] args) throws Excption{
     double heSoA, heSoB, heSoC, delta, X1, X2;
     System.out.println("Nhap he so A");
     Scanner sc = new Scanner (System.in);
     heSoA = sc.nexDouble();
     System.out.println("Nhap he so B");
     heSoB = sc.nexDouble();
     ystem.out.println("Nhap he so C");
     heSoC = sc.nexDouble();
     delta = heSoB*heSoB-4*heSoA*heSoC;
     if(delta < 0) {
         System.out.println("Phuong trinh vo nghiem");
     }else if(delta == 0) {
         X1 = -heSoB / (2*heSoA);
         System.out.println("Phuong trinh co nghiem kep: " + " X1 =X2 = " + X1);
     }else if(delta > 0) {
         X1 = (-heSoB + Math.sqrt(delta)) / (2*heSoA);
         X2 = (-heSoB - Math.sqrt(delta)) / (2*heSoA);
         System.out.println("Phuong trinh co 2 nghiem la: " + "X1 =" + x1 " va X2 = " + X2);
     }
sc.close();
    }
}

import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {
        String choui;
        char kyTu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 chuoi bat ky: ");
            chuoi = scanner.nextLine();
        }while ( chuoi.length() > 80 );
        System.out.println("Nhap vao ky tu can dem so lan xuat hien: ");
        kyTu = scanner.next().charAt(0);
        for ( int i = 0; i < chuoi.lenght(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                cuont++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + kyTu + " trong chuoi " + chuoi + " = " + count);
    }
}
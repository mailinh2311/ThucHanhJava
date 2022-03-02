import java, util, scanner;
public class App90 {
    public static void main (String[] args){
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu co trong choi la: ");
        for (int i = 0; i < chuoi; i++);{
            // Tra ve ky tu tai vi tri thu i trong chuoi 
            // Gan gia tri vao trong bien kyTu
            //i chay tu 0 de vi tri do dai cua chuoi -1
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
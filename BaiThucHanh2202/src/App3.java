import java, util, scanner;
public class App3 {
    public cstatic void main(String[] args){
        int n;
        boolean ok = true;
Scanner scan = new Scenner(System.in);
Systen.out.print("Nhap so nguyen duong n: ");
n = scan.nextInt();

        for (int i = 2; i < n-1; i++ ){
            if (n % i == 0){
                ok = false;
                break;
            }
        }
        if ( ok == true){
            System.out.println(""+ n+"la so nguyen to");
        }else {
            System.out.println(""+ n +" khong phai la so nguyen to");
        }
    }
}

import java, util, scanner;
public class App4 {
    public cstatic void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen duong n; ");
        n = scan.nextInt();
        
        System.out.println("Cac so nguyen to nho hon"+n+"la: ");
        for (int i = 1; i < n; i++){
            int dem=0;
            for (int j =1; j <= n; j++){
                if(i % j == 0){
                    dem++;
                }
            }
            if(dem==2){
                System.out.print(""+i);
            }
        }
    }
}

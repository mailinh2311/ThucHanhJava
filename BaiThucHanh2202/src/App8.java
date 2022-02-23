import java, util, scanner;
public class App8 {
    public cstatic void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while ( n <= 0) ;
        int A[] = new int [n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for ( int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu" + i +": ");
            A[i] = scanner.nextInt();
        } 
        System.out.println("Cac phan tu chia het cho 5 la: ");
        for ( int i = 0; i < n; i++){
            if (A[i] % 5 == 0){
                System.out.print(A[i] + "\t");
            }
        } 
    }
}
import java, util, scanner;
public class App9 {
    public cstatic void main(String[] args){
        int n;
        int[] soNguyenDuong;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        soNguyenDuong = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap vao so nguyen duong: ");
            soNguyenDuong[i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi dao nguoc: ");
        for(int i = 0; i < n; i++)
            System.out.println(soNguyenDuong[i] + " ");
        
        System.out.println("Mang sau khi dao nguoc: ");  
        for(int i = 0; i < n/2; i++){
            int empty;
            empty = soNguyenDuong[i];
            soNguyenDuong[n-i-1] = empty;
        }
        //In ra mang sau khi dao nguoc
        System.out.println("\nMang sau khi dao nguoc: ");
        for (int i = 0; i < n; i++)
        System.out.println(soNguyenDuong[i] + " ");
    }
}
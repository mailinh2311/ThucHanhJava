import java, util, scanner;
public class App81 {
    public static void main (String[] args){
        //Khai bao so dong so cot cua ma tran
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hap so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        n = scanner.nextInt();
        //Khai bao ma tran A co m dong, n cot
        int A[][] = new int[m][n];
        System.out.println("nhap cac phan tu cho ma tran: ");
        for( int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = scanner.nextInt();
            }
        }
        // Tim phan tu lon nhat trong ma tran
        // Gia su phan tu tai vi tri (0,0) la phan tu lon nhat
        int max = A[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
    }
}
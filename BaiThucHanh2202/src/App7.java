import java, util, scanner;
public class App7 {
    public cstatic void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong phan tu cho mang: ");
        n = sc.nextInt();
        int numberArr[] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " +_i + ": ");
            numberArr[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong mang la: ");
        for( double i : numberArr){
            System.out.print(i + ", ");
        } 
        double max = numberArr[0];
        for ( double num : numberArr){
            if(max < num)
               max = num;
        }
        System.out.printf("\nSo lonh nhat trong mang la: %2f ", max);

        System.out.println("\nSo lonh nhat trong mang la: %2f ", max);
    }
}
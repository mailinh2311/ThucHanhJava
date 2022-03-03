import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra n: ");
        n = sacnner.nextInt();
        if (n % 2 == 0){
            System.out.println(n + " la so chan!");
        }else{
            System.out.println(n + " la so le");
        }
    }
}
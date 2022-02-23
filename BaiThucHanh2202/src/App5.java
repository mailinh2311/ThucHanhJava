import java, util, scanner;
public class App5 {
    public cstatic void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        
        //Tim cac uoc cua n
        int sum = 0;
        for(int i =1; i < n; i++){
            if(n % i == 0){
               sum = sum + 1;
            }
        }
        if(sum == n){
            System.out.println(n +" la so hoan hao");
        }else{
            System.out.println(n +"Khong la so hoan hao");
        }
    }
}

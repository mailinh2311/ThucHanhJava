import java, util, scanner;
public class App6 {
    public cstatic void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        
        //Tim cac uoc cua n
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
        System.out.println("Cac so hoan hao nho "+n+"la: ");
        for(int i = 1; i < n; i++){
            if(n % i==true){
                System.out.println(i+"\t");
            }
        }  
    }
}
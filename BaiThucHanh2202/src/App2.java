import java, util, scanner;
public class App2 {
    public cstatic void main(String[] args){
        double a, b, c;
        Scanner scan = new Scanner(System.in);  
        do{
            System.out.println("Nhap canh thu nhat: ");
            a = sc.nextDouble();
            System.out.println("Nhap canh thu hai: ");
            b = sc.nextDouble();
            System.out.println("Nhap canh thu ba: ");
            c = sc.nextDouble();
        } while(a <= 0 || b <= 0 || c <= 0);
        if( a+b <= c || a+c <= b || c+b <= a )
        System.out.println("Day khong phai a mot tam giac! ");
        else{
            if( a==b && b==c )
             System.out.println("Day la tam giac deu: ");
             else if( a == b || b == c || c == a )  
             if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
             System.out.println("Day la tam giac vuong can: ");
             else System.out.println("Day la tam giac can: ");
        }
        else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
        System.out.println("Day la tam giac vuong: ");
        else
        System.out.println("Day la tam giac thuong: ");
    }
}

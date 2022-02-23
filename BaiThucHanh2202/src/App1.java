import java, util, scanner;
public class App1 {
    public cstatic void main(String[] args){
      int num1, num2;
      Scanner scan = new Scanner(System.in);   
      do{
        System.out.print("Nhap so thu nhat: ");
        num1 = sc.nextInt();
      }while(num <= 0);
      do{
        System.out.print("Nhap so thu hai: ");
        num2 = sc.nextInt();
      }while(num2 <= 0);
      while (num1 != num2){
        if(num1 > num2)
           num1 = num1 - num2;
        else
           num2 = num2 - num1;
      }
      System.out.printf("Uoc chung lon nhat ls: %d", num2);
        
    }
}

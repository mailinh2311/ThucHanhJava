import java, util, scanner;
public class App10 {
    public cstatic void main(String[] args){
        int number, count = 0; 
        Scanner scan = new Scanner(System.in);  
        System.out.println("Nhap vao mot so nguyen duong bat ki: ");
        number = Scanner.nextInt();
        while ( number <-= 0){
            System.out.println("So nhap phai lon hon 0: ");
            number = scanner.nextInt();
        } 
        while ( number > 0){
            number /= 10;
            count++;
        }
        System.out.println("So cac chu so = " + count);
    }
}
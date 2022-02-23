import java, util, scanner;
public class App11 {
    public cstatic void main(String[] args){
        Scanner scan = new Scanner(System.in);   
        int i, j, k;
        for (i = 0; i <= 20; i++)
        for (j = 0; j <= 10; j++)
        for (k = 0; k <= 4; k++)
        if( i*10000 + j*20000 + k*500000 == 200000)
        System.out.println("So to 10000" + i + ", so to 20000" + j + ", so to 50000" + k);
    }
}
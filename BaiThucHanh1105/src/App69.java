import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        //them cac phan tu vao treeSetInteger
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        //hien thi cac phan tu trong cac treeSetInteger
        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger)
        System.our.println("Nhap cac phan tu can them: ");
        number = scanner.nextInt();
        //Them mot phan tu tu moi vao treeSetInteger tu ban phim
        //neu phan tu do da ton tai thi thong bao ton tai nguoc lai khong thi them vao
        if (treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            Systrem.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("Phan tu" + number + " da ton tai!");
  
        }
    }
}
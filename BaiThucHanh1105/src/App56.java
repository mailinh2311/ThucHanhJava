import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        //Them cac phan tu vao hashSetString
        hashSetString.add("wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        //Hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        //neu phan tu can xoa co ton tai hashSetString thi se thong bao xoa thanh cong
        //va hien thi cac phan tu con lai nguoc lai thi thong bao xoa khpng thanh cong
        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa Thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            Systrm.out.println(hashSéttring);
        }else {
            System.out.println("Xoa khong thanh cong!");
        }

    }
}
import java.tex.DecimalFormat;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new decimalFormat("#.##");
        System.out.println("Nhap vao so thu nhat: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int secondNumber = scanner.nextInt();
        //Tinh tong, hieu, tich, thuong, phep chia lay du cua 2 so do
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + decimalFormat.format(thuong));
        //Lam tron den hai chu so thap phan
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
        //Su dung cac toan tu so sanh da hoc de so sanh 2 toan tu do
        System.out.println("Ket qua so sanh bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber == secondNumber));
        System.out.println("Ket qua so sanh khong bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber != secondNumber));
        System.out.println("Ket qua so sanh lon hon hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber > secondNumber));
        System.out.println("Ket qua so sanh lon hon hoac bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber >= secondNumber));
        System.out.println("Ket qua so sanh nho hon hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber < secondNumber));
        System.out.println("Ket qua so sanh nho hon hoac bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber <= secondNumber));
    }
}

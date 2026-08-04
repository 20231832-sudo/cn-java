import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {

        int n;
        int sum = 0;

        System.out.print("Nhap n = ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            sum += i;
           }

        System.out.println("Tong cac so chan = " + sum);
        }
    }
}
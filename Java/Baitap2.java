import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {

        int n;
        double sum = 0;

        System.out.print("Nhap n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Tong = " + sum);
    }
}
}

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int n;

        System.out.print("Nhap n = ");
        n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Day Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
}

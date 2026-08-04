import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n;
        boolean prime = true;

        System.out.print("Nhap n = ");
        n = sc.nextInt();

        if (n < 2) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(n + " la so nguyen to.");
        else
            System.out.println(n + " khong phai so nguyen to.");
    }
}
}
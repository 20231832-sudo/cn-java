import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        double a, b, c;

        System.out.print("Nhap a = ");
        a = sc.nextDouble();

        System.out.print("Nhap b = ");
        b = sc.nextDouble();

        System.out.print("Nhap c = ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a * a + b * b == c * c ||
                       a * a + c * c == b * b ||
                       b * b + c * c == a * a) {

                if (a == b || b == c || a == c)
                    System.out.println("Tam giac vuong can");
                else
                    System.out.println("Tam giac vuong");

            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giac can");
            } else {
                System.out.println("Tam giac thuong");
            }

        } else {
            System.out.println("Khong phai tam giac");
        }
    }
}
}

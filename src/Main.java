import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double c = 2 * 3.14 * a;

        System.out.printf("%.2f", c);

        sc.close();
    }
}

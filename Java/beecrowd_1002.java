import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, n=3.14159, R;

        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();

        A = n * R * R;

        System.out.printf("A=%.4f", A);
        System.out.println();

    }
}
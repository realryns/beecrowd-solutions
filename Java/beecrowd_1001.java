import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, X;
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        X = A + B;

        System.out.println("X = " + X);

    }
}    
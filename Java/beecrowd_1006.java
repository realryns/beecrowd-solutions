import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();
        
        double avg = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
        
        System.out.printf("MEDIA = %.1f", avg);
        System.out.println();
        
    }
}
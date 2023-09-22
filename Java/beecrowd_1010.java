import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int product1 = sc.nextInt();
        int qnt1 = sc.nextInt();
        double price1 = sc.nextDouble();
        
        int product2 = sc.nextInt();
        int qnt2 = sc.nextInt();
        double price2 = sc.nextDouble();
        
        double amount = qnt1 * price1 + qnt2 * price2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", amount);
        
	sc.close();

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        double fixedSalary = sc.nextDouble();
        double bonus = sc.nextDouble(); 
        
        double finalSalary = fixedSalary + bonus * 0.15;
        
        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
        
	sc.close();
    }
}
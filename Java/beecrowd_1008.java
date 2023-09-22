import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int code = sc.nextInt();
        int hours = sc.nextInt();
        double salary = sc.nextDouble();
        
        double totalSalary = hours * salary;
        
        System.out.println("NUMBER = " + code);
        System.out.printf("SALARY = U$ %.2f%n", totalSalary);
  	
	sc.close();      
    }
}
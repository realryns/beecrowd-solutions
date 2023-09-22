import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int X;
        double Y, consumo;
        
        X = sc.nextInt();
        Y = sc.nextDouble();
        
        consumo = X / Y;
        
        System.out.printf("%.3f km/l%n", consumo);
        
        sc.close();
        
    }
}
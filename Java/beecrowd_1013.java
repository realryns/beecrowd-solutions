import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, maior;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if ((A > B) && (A > C)) {
            maior = A;
        } else if (B > C) {
            maior = B;
        } else {
            maior = C;
        }
        
        System.out.println(maior + " eh o maior");
        
        sc.close();
        
    }
}
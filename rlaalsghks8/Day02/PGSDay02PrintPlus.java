import java.util.Scanner;

public class PGSDay02PrintPlus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        if(1<=a && b<=100){
            System.out.println(a + " + " + b + " = "  + (a + b));
        }
    }
}
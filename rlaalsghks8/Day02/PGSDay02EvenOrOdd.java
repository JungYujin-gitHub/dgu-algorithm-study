import java.util.Scanner;

public class PGSDay02EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(1<=n && n<=1000){
            if(n%2==0){
                System.out.println(n + " is even");
            }
            else if(n%2==1){
                System.out.println(n + " is odd");
            }
                
            
        }
    }
}

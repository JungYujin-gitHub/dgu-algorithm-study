import java.util.Scanner;

public class PGSDay01ForString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int i;

        int strLength = str.length();
        
        if(n>=1 && n<=5 && strLength>=1 && strLength<=10){
            for(i=0; i<n; i++){
                System.out.print(str);
            }
        }
    }
    
}

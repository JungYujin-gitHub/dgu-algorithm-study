import java.util.Scanner;

public class PGSDay01String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int strLength = a.length();

        if(strLength>=1 && strLength<=1000000 ){
            System.out.print(a);
        }
    }
}
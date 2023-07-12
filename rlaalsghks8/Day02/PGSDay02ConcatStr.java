import java.util.Scanner;

public interface PGSDay02ConcatStr {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int str1 = a.length();
        int str2 = b.length();
        
        String result = a.concat(b); //concat 사용하면 문자열을 붙여준다.
        
        if(1<=str1 && str2<=10){
            System.out.println(result);
        }
}
}
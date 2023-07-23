package day04;
import java.util.Scanner;

public class multipleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        if (num % n == 0)
            answer = 1;
        else
            answer = 0;
        System.out.println(answer);
    }
}

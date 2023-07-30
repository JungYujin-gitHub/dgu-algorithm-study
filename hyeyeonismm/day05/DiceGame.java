package day05;

public class DiceGame {
    public int solution(int a, int b, int c) {
        int squareNum = (int) (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int cubeNum = (int) (Math.pow(a,3)+ Math.pow(b,3)+ Math.pow(c,3));
        int sum = 0;
        
        if (a != b && a != c && b != c)
            sum = a+b+c;
        else if (a==b &&  b==c) {
            sum = (a+b+c)*squareNum*cubeNum;
        }
        else if (a==b || b==c || a==c)
            sum = (a+b+c) * squareNum;
        return sum;
    }
}

package day04;

public class ReturnOddEven {
    public int solution(int n) {
        int sum = 0;
        if (n%2 != 0) {
            for (int i=1;i<=n;i+=2)
                sum += i;
            return sum;
        }
        else {
            for (int j=2;j<=n;j+=2)
                sum += j*j;
            return sum;
        }
    }
}

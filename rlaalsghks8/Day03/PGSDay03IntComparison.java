public class PGSDay03IntComparison{
    public int solution(int a, int b) {
        int answer = 0;
        String tmp1 = "";
        int mulValue = 2*a*b;
        
        if(1<=a && b<=10000){
            tmp1 += a;
            tmp1 += b;
        }
        
        int resultA = Integer.valueOf(tmp1);
        
        
        if(resultA >= mulValue){
            answer = resultA;
        }
        else{
            answer = mulValue;
        }
       
        return answer;
    }
}
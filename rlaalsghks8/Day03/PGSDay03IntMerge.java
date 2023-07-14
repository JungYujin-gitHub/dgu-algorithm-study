public class PGSDay03IntMerge{
    public int solution(int a, int b) {
        int answer = 0;
        String tmp1 = "";
        String tmp2 = "";
        
        if(1<=a && b<=10000){
            tmp1 += a;
            tmp1 += b;
            tmp2 += b;
            tmp2 += a;
        }
        
        int resultA = Integer.valueOf(tmp1);    //문자열을 정수형으로 변경 Integer.parseInt(문자열) or
        int resultB = Integer.valueOf(tmp2);    // Integer.valueOf(문자열)
        
        if(resultA >= resultB){
            answer = resultA;
        }
        else{
            answer = resultB;
        }
        
        return answer;
    }
}
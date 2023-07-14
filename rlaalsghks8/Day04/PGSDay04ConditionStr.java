public class PGSDay04ConditionStr{
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">")){     //비교할 문자.equals(아마 spring에서도 비슷한 문법사용)
            if(eq.equals("=")){
               answer = (n>=m) ? 1:0;
            }else{
                answer = (n>m) ? 1:0;
            }
                
        }
        else if(ineq.equals("<")){
            if(eq.equals("=")){
              answer =  (n<=m) ? 1:0;
            }else{
               answer = (n<m) ? 1:0;
            }
        }
        return answer;
        
    }
}
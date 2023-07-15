public class PGSDay05ArithSeq{
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        
        int i;
        
        for(i=0; i<included.length; i++){
            int tmp = 0;
            if(included[i] == true){
                tmp = a + d*i;
            }
            answer += tmp;
        }
        
        return answer;
    }
}
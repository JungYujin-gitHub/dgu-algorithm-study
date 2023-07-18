import java.util.ArrayList;
import java.util.List;

public class PGSDay07ColatchSeq {
     public List solution(int n) {
        
        List<Integer> answer = new ArrayList<>();
        
        
        int i=n;
        answer.add(n);
        while(true){
            
            if(i%2==0){
                answer.add(i/=2);
            }
            else{
                answer.add(i=(i*3+1));
            }
            if(i==1){
                break;
            }       
            
        }
        
        
        
        
        
        return answer;
    }
}

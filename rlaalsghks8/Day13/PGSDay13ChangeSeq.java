import java.util.ArrayList;
import java.util.List;

public class PGSDay13ChangeSeq {
    public List solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        int i;
        for(i=n; i<num_list.length; i++){
        
            answer.add(num_list[i]);
                
        }
        for(int j=0; j<n; j++ ){
            answer.add(num_list[j]);  
        }
        
        
        return answer;
    }
}

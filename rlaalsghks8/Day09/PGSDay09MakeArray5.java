import java.util.ArrayList;
import java.util.*;
public class PGSDay09MakeArray5{
    public List solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int sliceValue = Integer.parseInt(intStrs[i].substring(s,s+l));
            
            if(sliceValue>k){
                answer.add(sliceValue);
            }
        }
        
        
        
        return answer;
    }
}
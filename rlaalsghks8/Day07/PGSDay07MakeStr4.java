import java.util.ArrayList;
import java.util.List;

public class PGSDay07MakeStr4 {
    public List solution(int[] arr) {
        
        List<Integer> stk = new ArrayList<>();
        
        int i;
        for(i=0; i<arr.length;){
            if(stk.size()==0){
                stk.add(arr[i]);
                i++;
            }
            
            if(stk.get(stk.size()-1)<arr[i]){
                   stk.add(arr[i]);
                    i++;
            }
            else{
                stk.remove(stk.size()-1);
            }
                
            
            
        }
        
        
        return stk;
    }
}

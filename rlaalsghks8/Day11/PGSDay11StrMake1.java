import java.util.ArrayList;
import java.util.List;

public class PGSDay11StrMake1 {
    public List solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            if(i%k==0 && i!=0){
                answer.add(i);
            }
        }
        
        return answer;
    }

    
}

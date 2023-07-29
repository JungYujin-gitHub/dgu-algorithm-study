import java.util.ArrayList;
import java.util.List;

public class PGSDay17RemoveAD {
    public List solution(String[] strArr) {
        List<String> answer =  new ArrayList<>();
        
        for(int i=0; i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        
        
        
        return answer;
    }
}

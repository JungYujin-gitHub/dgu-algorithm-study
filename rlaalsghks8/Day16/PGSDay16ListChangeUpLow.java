import java.util.ArrayList;
import java.util.List;

public class PGSDay16ListChangeUpLow {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
            answer.add(strArr[i].toLowerCase());
            }
            else if(i%2==1){
                answer.add(strArr[i].toUpperCase());
            }
        }
        
        
        return answer;
    }
}

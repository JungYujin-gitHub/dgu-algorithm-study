import java.util.ArrayList;
import java.util.List;

public class PGSDay14LOL5Group {
    public List solution(String[] names) {
        List<String> answer = new ArrayList<>();
        
        
        for(int i=0; i<names.length; i+=5){
            answer.add(names[i]);
        }
        

        
        return answer;
    }
}
import java.util.ArrayList;
import java.util.List;

public class PGSDay11DeleteStr {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        List<String> result = new ArrayList<>();
        
        String[] tmp = my_string.split("");
        for(int k=0; k<my_string.length();k++){
            result.add(tmp[k]);
        }
        
        
        for(int i=0; i<indices.length; i++){
            int removeIdx = indices[i];
            for(int j=0; j<result.size();j++){
                result.set(removeIdx,"");
            }
        }
        
        result.remove("");
        
        
        
        answer = String.join("",result);
        
        return answer;
    }
}

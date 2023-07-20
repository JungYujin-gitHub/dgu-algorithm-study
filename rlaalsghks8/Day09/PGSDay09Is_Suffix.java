import java.util.ArrayList;
import java.util.List;

public class PGSDay09Is_Suffix {
     public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> dictionary = new ArrayList<>();
        
        int myLen = my_string.length();
        
        for(int i=0; i<myLen;i++){
            String suffix = my_string.substring(i);
            dictionary.add(suffix);
        }
        
        if(dictionary.contains(is_suffix)){
            answer = 1;
        }else{
            answer =0;
        }
        
        
        
        return answer;
    }
}

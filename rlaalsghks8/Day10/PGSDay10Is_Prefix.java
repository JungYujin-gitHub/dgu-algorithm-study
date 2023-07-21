import java.util.ArrayList;
import java.util.List;

public class PGSDay10Is_Prefix {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> dictionary = new ArrayList<>();
        
        int myLen = my_string.length();
        
        for(int i=0; i<myLen;i++){
            String prefix = my_string.substring(0,i);
            dictionary.add(prefix);
        }
        
        if(dictionary.contains(is_prefix)){
            answer = 1;
        }else{
            answer =0;
        }
        
        
        
        return answer;
    }
}

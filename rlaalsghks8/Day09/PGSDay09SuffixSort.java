import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PGSDay09SuffixSort {
    public List solution(String my_string) {
        
        String[] answer = {};
        
       List<String> dictionary = new ArrayList<>();
        
        int myLen = my_string.length();
        
        for(int i=0; i<myLen;i++){
            String suffix = my_string.substring(i);
            dictionary.add(suffix);
        }
        
        Collections.sort(dictionary,String.CASE_INSENSITIVE_ORDER); //오름차순으로 배열
        
        
        
        
        return dictionary;
    }
}

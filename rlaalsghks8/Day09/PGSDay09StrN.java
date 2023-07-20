import java.util.*;
public class PGSDay09StrN{
    public String solution(String my_string, int n) {
        String answer = "";
        
        int myLen = my_string.length();
        int start = myLen - n;
        
        answer = my_string.substring(start);
        
        
        return answer;
    }
} 
    


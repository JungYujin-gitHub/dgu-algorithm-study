import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<my_string.length();i++){
            list.add(my_string.substring(i,my_string.length()));
        }
        Collections.sort(list);
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

import java.util.Arrays;

public class PGSDay13LeftRight {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for(int i = 0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);
                return answer;
            }else if(str_list[i].equals("r")) {
                answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
                return answer;
            }
        }
        return answer;
    }
}

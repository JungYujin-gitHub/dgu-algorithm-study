import java.util.*;
public class PGSDay06LastElement{
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>(); // answer 타입 변경 후
        
        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);     //answer는 List타입이라 값을 추가할 수 있음
        }
        
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            answer.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            answer.add(num_list[num_list.length - 1] * 2);
        }
        return answer;
    }
}

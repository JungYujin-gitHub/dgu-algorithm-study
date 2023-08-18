import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] arr = myString.split("x");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")==false) list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        answer = new String[list.size()];
        for(int i=0;i<answer.length;i++) answer[i] = list.get(i);
        return answer;
    }
}

import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            list.add(n);
            if(n==1) break;
            if(n%2==0) n/=2;
            else n = 3*n+1;
            
        }
        int index = list.size();
        answer = new int[index];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

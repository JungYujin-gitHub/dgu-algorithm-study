package day06;

public class LastTwoNum {
    public int[] solution(int[] num_list) {
        int[] answer= new int[num_list.length+1]; //4
        
        for (int i=0;i<num_list.length;i++) {
            answer[i] += num_list[i];
        }
        
        if (answer[num_list.length-1] > answer[num_list.length-2]) {
            answer[num_list.length] += (answer[num_list.length-1] - answer[num_list.length-2]);
        }
        else {
            answer[num_list.length] += (answer[num_list.length-1]*2);
        }

        return answer;
    }
}

// ArrayList로 구현하는 방법도 찾아볼 것

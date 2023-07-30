package day05;

public class MulAndSum {
        public int solution(int[] num_list) {
        int mul=1,sum=0;
    
        for (int i=0;i<num_list.length;i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        int answer = (mul<Math.pow(sum,2))? 1:0;
        return answer;
    }
}

import java.util.Arrays;

public class PGSDay06SeqAndQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);  
         /**Arrays.fill()은 배열의 모든 값을 같은 값으로 초기화하는 메서드입니다
           Arrays.fill()을 사용하지 않으면 for문을 사용해서 배열의 값을 일정하게 초기화해야합니다
           간편하게 배열의 값을 초기화가 가능합니다 
        */
        
        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > queries[j][2]) {
                    answer[j] = Math.min(answer[j], arr[i]);
                }
            }
            if (answer[j] == Integer.MAX_VALUE) answer[j] = -1;
        }
        return answer;
    }
}

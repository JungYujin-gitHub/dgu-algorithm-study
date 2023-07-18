import java.util.Arrays;
public class PGSDay07SeqAndQuery4{
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[arr.length];
        
        answer = arr;
        
        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if(i==0){
                    answer[0] = arr[0]+1;
                    continue;
                }
                if (i%queries[j][2]==0) {
                    answer[i] = arr[i]+1;
                }
            }
            
        }
        return answer;
    }
}
public class PGSDay14SeqAndQuery1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        answer = arr;
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start; j<=end; j++){
                answer[j] +=1;
            }
        }
        return answer;
    }
}

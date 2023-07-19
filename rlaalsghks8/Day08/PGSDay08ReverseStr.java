public class PGSDay08ReverseStr{
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= (start+end)/2; j++) {
                char temp = answer[j];
                answer[j] = answer[start+end-j];
                answer[start+end-j] = temp;
            }
        }
        return new String(answer);
    
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        char[] arr;
        for(int i=0;i<queries.length;i++){
            arr = answer.toCharArray();
            int s = queries[i][0];
            int e = queries[i][1];
            while(e>=queries[i][0]){
                arr[s++] = answer.charAt(e--);
            }
            answer = String.valueOf(arr);
        }
        
        return answer;
    
}
}

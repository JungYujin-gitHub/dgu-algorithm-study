class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string;
        char[] arr = my_string.toCharArray();
        int start = s;
        int end = e;
        while(end>=s){
            arr[start++] = answer.charAt(end--);
        }
        answer = String.valueOf(arr);
        return answer;
    }
}

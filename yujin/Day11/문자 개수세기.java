class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>='A' && my_string.charAt(i)<='Z'){
                answer[(int)my_string.charAt(i)-65]++;
            }else if(my_string.charAt(i)>='a' && my_string.charAt(i)<='z'){
                answer[(int)my_string.charAt(i)-71]++;
            }
        }
        return answer;
    }
}

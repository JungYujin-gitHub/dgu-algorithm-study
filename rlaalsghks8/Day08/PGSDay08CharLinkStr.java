public class PGSDay08CharLinkStr {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        
        int i;
        for(i=0; i<index_list.length;i++){
            int j=index_list[i];
            answer += my_string.charAt(j);
            
        }
        
        return answer;
    }
}

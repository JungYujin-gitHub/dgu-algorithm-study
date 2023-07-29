public class PGSDay11StrCount{
    public int[] solution(String my_string) {
        int[] answer = new int[52];
       
        
        for(int i=0;i<my_string.length(); i++){
            char token = my_string.charAt(i);
            int idx=0;
            if(token>='A' && token <='Z'){
                idx = (int)token - 65;
            }
            else if(token>='a' && token<='z'){
                idx = (int)token - 97+26;
            }
            
                answer[idx]++;
            
            
        }
        
        
        return answer;
    }
}
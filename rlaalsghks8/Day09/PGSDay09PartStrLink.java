public class PGSDay09PartStrLink {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        int j=0;
        for(int i=0; i<parts.length; i++){
            int start = parts[i][0];
            int end = parts[i][1];
        
                String token = my_strings[j].substring(start,end+1);
                answer += token;
                j++;
                
            }
              
        
        
        
        return answer;
    }
    
}

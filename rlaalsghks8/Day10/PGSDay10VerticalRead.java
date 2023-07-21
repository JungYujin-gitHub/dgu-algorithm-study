public class PGSDay10VerticalRead {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int myLen = my_string.length();
        char vertical[][]= new char[myLen/m][m];
        int s=0;
        
        for(int i=0;i<myLen/m;i++){
            for(int j=0; j<m; j++){
                vertical[i][j] = my_string.charAt(s);
                s++;
            }
        }
        
        for(int k=0;k<myLen/m;k++){
            answer += vertical[k][c-1];
        }
        
        
        return answer;
    }
    
}

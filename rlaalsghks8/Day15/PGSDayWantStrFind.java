public class PGSDayWantStrFind {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String mStr = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        
        if(mStr.indexOf(patStr)!=-1){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}

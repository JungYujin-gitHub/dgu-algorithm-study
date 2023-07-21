public class PGSDay10QRCode {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        int codeLen = code.length();
        for(int i=0; i<codeLen; i++){
            if(i%q==r){
                answer += code.charAt(i);
            }
        }
        
        
        
        return answer;
    }
    
}

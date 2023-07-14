public class PGSDay03StringMul {
    public String solution(String my_string, int k) {
        String answer = "";
        
        int myLen = my_string.length();
        if(1<=k && k<=100 && 1<=myLen && myLen<=100){
            for(int i=0; i<k; i++){
                answer += my_string;
            }
        }
        
        return answer;
    }
}

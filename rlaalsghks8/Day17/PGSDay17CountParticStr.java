public class PGSDay17CountParticStr {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        for(int i=0; i<=myString.length()-pat.length(); i++){
            if(myString.substring(i,patLen).contains(pat))
                answer++;
            patLen++;
        }
        
        return answer;
    }
}

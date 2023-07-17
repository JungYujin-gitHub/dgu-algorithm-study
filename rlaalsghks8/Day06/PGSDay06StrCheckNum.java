public class PGSDay06StrCheckNum{
    public int solution(int n, String control) {
        int answer = 0;
        
        int i;
        for(i=0; i<control.length();i++){
            if('w'== control.charAt(i))
                n++;
            else if('s'== control.charAt(i))
                n--;
            else if('d'== control.charAt(i))
                n+=10;
            else if('a'== control.charAt(i))
                n-=10;
        }
        
        
        answer = n;
        
        
        return answer;
    }
}
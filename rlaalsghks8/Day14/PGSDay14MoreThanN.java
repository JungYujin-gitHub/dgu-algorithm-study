public class PGSDay14MoreThanN {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
            if(n<answer)
                break;
        }
        
        
        return answer;
    }
}
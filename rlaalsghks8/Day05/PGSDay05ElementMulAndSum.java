public class PGSDay05ElementMulAndSum {
    public int solution(int[] num_list) {
        int answer = 0;
        int squValue = 0;
        int mulValue = 1;
        int sum=0;
        int i;
        for(i=0; i< num_list.length; i++){
            mulValue *= num_list[i];
        }
        for(i=0; i< num_list.length; i++){
            sum += num_list[i];
        }
        
        squValue = sum*sum;
        if(mulValue < squValue){
            answer = 1;
        }
        else if(mulValue > squValue){
            answer = 0;
        }
        
        
        
        return answer;
    }
}

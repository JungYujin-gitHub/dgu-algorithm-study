public class PGSDay05LinkNum {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr = "";
        String evenStr = "";
        
        int i;
        for(i=0; i<num_list.length; i++){
            if(num_list[i]%2==1){
                oddStr += num_list[i]; 
            }
            else{
                evenStr += num_list[i];
            }
        }
        answer = Integer.valueOf(oddStr) + Integer.valueOf(evenStr);
        
        return answer;
    }
    
}

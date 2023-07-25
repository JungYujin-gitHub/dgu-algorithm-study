import java.util.ArrayList;
import java.util.List;

public class PGSDay12ListSplit{
    public List solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int numLen = num_list.length;
        
     
        if(n==1){
            for(int i=0; i<=b;i++){
                answer.add(num_list[i]);
            }
        }
        else if(n==2){
            for(int i=a; i<numLen;i++){
                answer.add(num_list[i]);
            }
        }
        else if(n==3){
            for(int i=a; i<=b;i++){
                answer.add(num_list[i]);
            }
        }
        else if(n==4){
            for(int i=a; i<=b;i+=c){
                answer.add(num_list[i]);
            }
        }
        
        
        return answer;
    }
}
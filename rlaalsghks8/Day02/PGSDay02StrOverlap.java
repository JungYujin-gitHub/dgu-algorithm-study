public class PGSDay02StrOverlap{
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);   //answer에 s(인덱스)부터 문자 대입
        }
        int j = 0;
        while(j<overwrite_string.length()){
            answer += overwrite_string.charAt(j);  //겹쳐쓸 문자열(overwrite_string)을 answer에 대입
            j++;
        }
        int k = j+s;
        while(k<my_string.length()){               //마지막 answer에 남아있는 my_string을 추가
            answer += my_string.charAt(k);
            k++;
        }
        return answer;
    }
}
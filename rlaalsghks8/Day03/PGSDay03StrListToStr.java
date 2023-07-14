public class PGSDay03StrListToStr {
    public String solution(String[] arr) {
        
        String answer = "";
       
        int arrSize = arr.length; //배열 길이(배열변수.length)
        
        for(int i=0; i<arrSize; i++){
            answer += arr[i];     //배열(문자형)은 []인덱스 사용 , 문자열일 경우 charAt(번호)
        }
        
        
        return answer;
    }
}


/**
 * 심플한 답변
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
 */

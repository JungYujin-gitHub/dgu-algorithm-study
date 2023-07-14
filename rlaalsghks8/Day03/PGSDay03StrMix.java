public class PGSDay03StrMix {
    public String solution(String str1, String str2) {
        String answer = "";
           
           int str1Len = str1.length();
           int str2Len = str2.length();
           int i=0;
           int j=0;
           int k=0;
           if(1<= str1Len && str1Len==str2Len && str2Len<=10){
               while(k<str1Len){
                  answer += str1.charAt(i++);
                  answer += str2.charAt(j++);
                  k++;
               }
           }
               
           return answer;
       }
    
}

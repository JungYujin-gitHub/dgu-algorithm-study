public class PGSDay10ReverseStr {
    public String solution(String my_string, int s, int e) {
        
        
        char[] reverseStr = my_string.toCharArray();
        char tmp;
    
        for(int i=s; i<=(s+e)/2;i++){
            tmp = reverseStr[i];
            reverseStr[i] = reverseStr[s+e-i];
            reverseStr[s+e-i] = tmp;
        }
        

        return new String(reverseStr);
    }
}

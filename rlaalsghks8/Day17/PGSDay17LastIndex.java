public class PGSDay17LastIndex{
    public String solution(String myString, String pat) {
     int idx = myString.lastIndexOf(pat);
        
    return myString.substring(0,idx) + pat;
}
}
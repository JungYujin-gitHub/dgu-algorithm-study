public class PGSDay17SplitStr2 {
    public String[] solution(String myString) {

        //return my_string.trim().split("[ ]+");
        return myString.trim().split("\\s+");
        //또 다른 예로 중간 공백이 가변적인 경우 1개 이상의 
        //공백이 있는 데이터를 정상적으로 잘라내고 싶다. 
    }
}
/**
 * StringTokenizer st = new StringTokenizer(my_string);
        
        int N = st.countTokens();
        
        String[] result = new String[N];
        
        for (int i = 0; i < N; i++) {
            result[i] = st.nextToken();
        }
        
        return result;
    }
 */
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split("\\+|\\-|\\*|\\/");
        int a = Integer.parseInt(arr[0].substring(0,arr[0].length()-1));
        int b = Integer.parseInt(arr[1].substring(1,arr[1].length()));
        System.out.println(a+","+b);
        if(binomial.contains("+")) answer = a+b;
        else if(binomial.contains("-")) answer = a-b;
        else if(binomial.contains("*")) answer = a*b;
        else if(binomial.contains("/")) answer = a/b;
        return answer;
    }
}

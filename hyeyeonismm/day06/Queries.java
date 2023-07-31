package day06;

public class Queries {
       public int[] solution(int[] arr, int[][] queries) {
        int tmp=0;
        for (int i=0;i<queries.length;i++) {
            tmp = arr[queries[i][0]]; //0 (0,3)
            arr[queries[i][0]] = arr[queries[i][1]]; //0=>3으로 swap (3,3)
            arr[queries[i][1]] = tmp; //3=>0으로 swap (3,0)           
        }
        
        return arr;
    }
}

package day06;

import java.util.Arrays;

public class Queries2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE); //Integer.MAX_VALUE는 정수의 최댓값을 표현한다 (무한대수라고 생각하면됨)
        //Arrays.fill()은 배열의 모든 값을 같은 값으로 초기화하는 메서드이다. 
        for (int i=0;i<queries.length;i++) { //0,1,2
            for (int j=queries[i][0];j<=queries[i][1];j++) {//0~4
                if (arr[j]>queries[i][2]) //arr[j]>2
                    answer[i] = Math.min(answer[i], arr[j]); //answer[i]=(무한대, 4) 중 더 작은 값
            }
            if (answer[i]==Integer.MAX_VALUE) //만약 답이 최댓값이라면 -1을 출력
            answer[i]=-1;
        }
        return answer;
    }
}

/* 담에 한번더풀어봐야댐.. */

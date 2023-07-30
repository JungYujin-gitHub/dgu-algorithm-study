package day05;

public class LinkNum {
    public int solution(int[] num_list) {
        String odd="";
        String even="";
        
        for (int i=0;i<num_list.length;i++) {
            if (num_list[i]%2 == 0)
                even += num_list[i];
            else
                odd += num_list[i];
        }
        return Integer.parseInt(odd)+Integer.parseInt(even);
    }
}

/* 자바에서는 덧셈 연산자를 진행할때 한 쪽이 string이면 나머지 쪽을 string으로 자동 변환한다.*/
/* char형은 안됨 */
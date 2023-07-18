import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {

        List<Integer> list = new ArrayList<>(); //List 객체 생성
        int[] answer = { -1 };

        for (int i = l; i <= r; i++) {
            String temp = "";
            temp += i;
            temp = temp.replace("5", ""); //5-> "", 
            temp = temp.replace("0", "");  //10 -> 1
            if (temp == "") {
                list.add(i);  //temp에 값이 없으면 추가
            }

        }

        return list.size() == 0 ? answer : list.stream().mapToInt(i -> i).toArray();
        //list에서 stream()은 list에 모든 스트림을 IntStream으로 변환해주는 메서드다. IntStream을 제외한 모든 스트림에서 동일하게 제공하는 메서드다.

    }

}
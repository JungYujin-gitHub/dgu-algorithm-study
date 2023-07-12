import java.util.Scanner;

public class PGSDay01ConvertStr {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String result = "";

        for(char i : a.toCharArray()){  //문자열을 한 글자씩 쪼개서 char타입의 배열에 집어 넣어주는 메소드

            if(Character.isLowerCase(i)){   //만약 현재 문자가 소문자인 경우
                result += Character.toUpperCase(i); //대문자로 변경
            }else{
                result += Character.toLowerCase(i); //소문자로 변경
            }
        }

        System.out.print(result);
    }
    
}

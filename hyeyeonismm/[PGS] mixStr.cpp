#include <iostream>
#include <string>
using namespace std;

string solution(string str1, string str2) {
    string answer = "";

    for (int i = 0; i < str1.length(); i++) {
        answer += str1[i];
        answer += str2[i];
    }
    return answer;
}

/* answer += str1[i]; answer += str2[i]; 는 되는데 answer += str1[i] + str2[i];는 안되는 이유 */
// str1[i]는 char 타입이다. cpp에서 char타입의 변수들을 더하면 더한 결과는 
// 두 문자의 ASCII값이 더해진 값이 된다. 만약 두 문자를 연결하고 싶다면 string으로 변환한 뒤 사용해야 한다.
// answer += string(1, str1[i]) + string(1, str2[i])도 가능

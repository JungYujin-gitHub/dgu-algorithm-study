#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    string str1 = "";
    string str2 = "";
    str1 += to_string(a) + to_string(b);
    str2 += to_string(b) + to_string(a);
    
    answer = (stoi(str1) > stoi(str2) ? stoi(str1) : stoi(str2));
    return answer;
}

/* 이런 방법도 있다. */
// return max(stoi(to_string(a)+to_string(b)),stoi(to_string(b)+to_string(a)));

#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    string str= to_string(a)+ to_string(b);
    int num=2*a*b;
    
    answer = max(stoi(str), num);
    
    if (stoi(str) == num) {
        answer = stoi(str);
    }
    
    return answer;
}

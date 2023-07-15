#include <string>
#include <vector>

using namespace std;

int solution(int a, int d, vector<bool> included) {
    int answer = 0;
    
    for(bool i : included) {
        if(i)   answer += a;
        a += d;
    }
    
    return answer;
}
#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    string answer;
    
    if(to_string(a) + to_string(b) > to_string(b) + to_string(a))   answer = to_string(a) + to_string(b);
    else answer = to_string(b) + to_string(a);

    return stoi(answer);
}
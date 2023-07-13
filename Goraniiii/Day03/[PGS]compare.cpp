#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int concate = stoi(to_string(a) + to_string(b));
    int exresult = 2 * a * b;
    
    if(concate > exresult)  return concate;
    else return exresult;
}
#include <string>
#include <vector>

using namespace std;

string solution(string code) {
    bool mode = 0;
    string ret = "";
    for(int idx = 0; idx < code.length(); idx++)  {
        if(code[idx] == '1')    mode = !mode;
        else {
            if((idx % 2 == 0) && !mode)    ret += code[idx];
            else if((idx % 2 == 1) && mode)     ret += code[idx];
        }
    }
    
    if(ret.empty())   ret = "EMPTY";

    return ret;
}
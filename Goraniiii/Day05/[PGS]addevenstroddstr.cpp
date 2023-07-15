#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    string oddstr = "", evenstr = "";
    
    for(int num : num_list) {
        if(num % 2 == 0) evenstr += to_string(num);
        else oddstr += to_string(num);
    }
    
    return stoi(evenstr) + stoi(oddstr);
}
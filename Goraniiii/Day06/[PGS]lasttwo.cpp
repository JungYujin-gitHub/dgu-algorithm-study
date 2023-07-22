#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer;
    int size = num_list.size();
    
    for(int i : num_list) {
        answer.push_back(i);
    }
    if(answer[size - 1] > answer[size - 2])     answer.push_back(answer[size - 1] - answer[size - 2]);
    else    answer.push_back(2 * answer[size - 1]);
    
    return answer;
}
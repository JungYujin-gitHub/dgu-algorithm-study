#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    answer = arr;

    for(vector<int> querie : queries) {
        swap(answer[querie[0]], answer[querie[1]]);
    }

    return answer;
}
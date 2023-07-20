#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    int tmp;
    bool flag;

    for(vector<int> querie : queries) {
        tmp = -1;
        flag = false;
        for(int i = querie[0] ; i < querie[1] + 1; i++) {
            if(arr[i] > querie[2]) {
                if(flag) {
                    if(tmp >= arr[i])   tmp = arr[i];
                }
                else {
                    flag = true;
                    tmp = arr[i];
                }
            }
        }
        answer.push_back(tmp);
    }

    return answer;
}
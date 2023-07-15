#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int sum = 0, mul = 1;
    for(int num : num_list) {
        sum += num;
        mul *= num;
    }
    return (sum * sum > mul);
}
using namespace std;

int solution(int number, int n, int m) {
    return (number % m == 0) && (number % n == 0) ? 1 : 0;
}
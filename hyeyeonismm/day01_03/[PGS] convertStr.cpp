#include <iostream>
#include <string>
using namespace std;
int main() {
	string str;
	cin >> str;

	for (int i = 0; i < str.length(); i++) { 
		if (str[i] <= 90) { //ASCII 코드 사용하여 변환
			str[i] += 32;
		}
		else
			str[i] -= 32;
	}
	cout << str;
	return 0;
}

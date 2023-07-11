#include <iostream>
#include <string>
#include <cctype> // to use isupper, islower, tolower, toupper

using namespace std;

int main(void) {
    string str;
    int n;
    cin >> str >> n;
    

    for(char& c : str){
        if(isupper(c))    c = tolower(c);
        else if(islower(c))    c = toupper(c);
        // else { } // in this problem, string is only alphabets
    }
    
    cout << str;
    
    return 0;
}
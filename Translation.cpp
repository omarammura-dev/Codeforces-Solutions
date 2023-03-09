#include <iostream>
#include <algorithm>

using namespace std;
int main() {
    string x,y;

    getline(cin,x);
    getline(cin,y);

    reverse(x.begin(),x.end());

    if(x == y)
        cout << "YES";
    else
        cout << "NO";
}
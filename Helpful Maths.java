#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;
int main() {
    string str;
    getline(cin,str);
    str.erase(remove(str.begin(),str.end(),'+'),str.end());
    char* tab2 = new char[str.size()+1];
    strcpy(tab2, str.c_str());
 
    sort(tab2,tab2+str.size());
    for (int i = 0; i < str.size(); ++i) {
        cout << (tab2[i]);
        if (str.size()-1 != i)
            cout << "+";
    }
}
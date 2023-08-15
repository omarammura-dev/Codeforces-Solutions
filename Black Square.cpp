#include <bits/stdc++.h>

using namespace std;
#define IOS ios::sync_with_stdio(0);cin.tie(0);

int main() {
    IOS;
    int arr[4];
    string s;
    int counter=0;
    for(int i=0;i<4;i++)
    {
        cin >> arr[i];
    }
    cin >>s;

    for(int i=0;i<s.size();i++)
    {
        switch(s[i]){
            case '1': counter+=arr[0]; break;
            case '2': counter+=arr[1]; break;
            case '3': counter+=arr[2]; break;
            case '4': counter+=arr[3]; break;
        }
    }

    cout << counter;


    return 0;
}

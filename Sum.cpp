
#include <bits/stdc++.h>

using namespace std;
#define IOS ios::sync_with_stdio(0);cin.tie(0);



int main() {
    IOS;
    int t;
    cin >> t;
    while(t--)
    {
        const int size = 3;
        int arr[size];
        for(int i=0;i<size;i++)
        {
            cin >> arr[i];
        }
        sort(arr,arr+size);
        if(arr[0]+arr[1] == arr[2])
            cout << "YES" << '\n';
        else
            cout << "NO" << '\n';
    }


    return 0;
}


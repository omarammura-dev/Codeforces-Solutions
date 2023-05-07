
#include <bits/stdc++.h>

using namespace std;
#define IOS ios::sync_with_stdio(0);cin.tie(0);



int main()
{
     IOS;
    int x,y,n,t;
    cin >> t;
    while(t--)
    {
        cin >> x>>y>>n;
        int ans =(n-y)/x;
        cout << (ans*x)+y<< '\n';
    }

    return 0;
}





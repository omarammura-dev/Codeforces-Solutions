#include <bits/stdc++.h>

using namespace std;
#define IOS ios::sync_with_stdio(0);cin.tie(0);

int lastDigit(int n)
{
    // return the last digit
    return (n % 10);
}
int main()
{
    IOS;
    int t,k;
    cin>> t;
    vector<int> v;
   while(t--)
   {
      cin >> k;
        k--;
        for(int i=1;i<=1667;i++)
        {
            if(i%3 !=0 && i %10 != 3)
            {
                v.push_back(i);
            }
        }
        cout << v[k] << '\n';
   }


    return 0;
}





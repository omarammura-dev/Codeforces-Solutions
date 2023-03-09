#include <bits/stdc++.h>

using namespace std;

int main()
{
    //less than 240 min
    int n,k,counter=0,temp=0;
    cin >> n >>k;
    for(int i=1;i<=n;i++)
    {
        temp += i*5;
        if((temp+k)<=240) counter++;
    }

    cout << counter;
}

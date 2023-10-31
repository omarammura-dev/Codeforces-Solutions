#include <iostream>
#include <bits/stdc++.h>
using namespace std;



int main()
{
    int n,t,num_of_ones,nums_twos;

    cin>>t;
    while(t--)
    {
        cin >> n;
        int array[n];
        for(int i =0;i<n;i++)
        {
            cin >> array[i];
        }
        num_of_ones = count(array,array+n,1);

        if(num_of_ones == 0 && n % 2 == 0)
        {
            cout << "YES" << '\n';
        }
        else
        {
            if(num_of_ones != 0)
            {
                num_of_ones % 2 == 0 ? cout << "YES" << '\n' : cout << "NO"<< '\n';
            }
            else if( n== 1)
            {
                cout << "NO"<< '\n';
            }
            else
            {
                cout << "NO"<< '\n';
            }
        }
    }
}

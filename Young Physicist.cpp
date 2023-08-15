#include <iostream>
#include <algorithm>
using namespace std;
#include<string>
int main()
{
    int n,x=0,y=0,z=0;
    cin >> n;
    int array[n][3];
    for(int i = 0; i < n;i++)
    {
         for(int j = 0; j < 3;j++)
        {
            cin >> array[i][j];
        }
    }
     for(int i = 0; i < n;i++)
    {
        x += array[i][0];
        y += array[i][1];
        z += array[i][2];
        
    }
    
   if(x == 0 && y == 0 &&z==0)
    {
        cout << "YES" << '\n';
    }
    else
    {
        cout << "NO" << '\n';
    }
}
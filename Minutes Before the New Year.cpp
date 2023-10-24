#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int t,h,m,total=0;
   cin >> t;

   while(t--)
   {
      cin >> h >> m;
      total = (h*60) + m;
      cout << 1440 - total << '\n';
   }
   
}

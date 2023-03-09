#include <bits/stdc++.h>

using namespace std;

int main()
{
    //less than 240 min
   int a,b,c=0,c1=0;
   cin >> a>>b;

   while(a*b)
   {
       a--;
       b--;
       c++;
   }
   if(a == 0 && b !=0 && 2<=b)
   {
      c1 = b/2;
   }
   else if(a != 0 && b ==0 && 2<=a)
   {
       c1 = a/2;

   }

   cout << c << " "<< c1;
}

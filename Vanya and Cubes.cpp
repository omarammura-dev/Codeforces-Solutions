#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n,current=0,row=0;
   cin >> n;

   if(n == 1 || n == 2)
   {
      cout << 1;
   }
   else{
      while(current <= n)
      {
         for(int i=0; i<row;i++)
         {
            current += (row-i);
         }
         row++;
      }
      cout << row-2;
   }
}

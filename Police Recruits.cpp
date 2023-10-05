#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n,count=0,re=0;
   cin >> n;
   int events[n];
   for(int i = 0;i < n;i++)
   {
      cin >> events[i];
   }
   for(int i = 0;i < n;i++)
   {
        if(events[i] < 0 && re == 0)
        {
          count++;
        }
        else if(events[i] > 0 || re !=0){
            re += events[i];
        }
   }
   cout << count;
}
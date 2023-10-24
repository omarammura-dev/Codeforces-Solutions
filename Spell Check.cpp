#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   
   int t,n,counter=0;
   string k = "Timru";
   cin >>t;
   while(t--)
   {
      cin >> n;
      char s[n+1];
      cin >> s;
      sort(s,s+n);
      if (n == 5)
      {
         for(int i = 0;i<n;i++)
         {
            if(s[i]==k[i])
            {
              counter++;
            }
         }
          if(counter == 5)
          {
            cout << "YES" << '\n';
          }
          else{
                cout << "NO" << '\n';
          }
          counter = 0;
      }
      else
      {
         cout << "NO" << '\n';
      }
   
   }
   
}

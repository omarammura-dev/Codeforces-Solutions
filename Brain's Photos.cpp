#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n,m;
  bool x =false;
  cin >> n >> m;
  char s[n][m];
  
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<m;j++)
      {
         cin >> s[i][j];
      } 
  }
   for(int i=0;i<n;i++)
  {
      for(int j=0;j<m;j++)
      {
         if (s[i][j] == 'C' || s[i][j] == 'M'  || s[i][j] == 'Y')
         {
            cout << "#Color";
            x = true;
            break;
         }
      } 
      if(x)
      {
         break;
      }
  }
  if(x != true)
  {
   cout << "#Black&White";
  }


}

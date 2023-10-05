#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int m,c,n,i=0,j=0,winner;
   cin >> n;
   while(n--){
      cin >> m >> c;
      winner = max(m,c);
      if(winner == m && winner != c)
      {
         i++;
      }
      else if(winner == c && winner != m){
         j++;
      }
      else{
         i++;
         j++;
      }
   }

   if(i > j)
   {
      cout << "Mishka";
   }
   else if(j>i)
   {
      cout << "Chris";
   }
   else{
      cout << "Friendship is magic!^^";
   }
}
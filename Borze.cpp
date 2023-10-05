#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   string s;
   cin >> s;
   int size = s.length();
   char *charcters = new char[size+1];
   strcpy(charcters,s.c_str());
   if(size % 2 == 0)
   {
      size = size /2;
   }
   else{
      size = (size/2) +1;
   }
   for(int i = 0,j=1;i<s.length();)
   {
         if(charcters[i] == '.')
         {
            cout << 0;
            i++;
            j++;
         }
         else if(charcters[i] == '-' && charcters[j] == '.')
         {
            cout << 1;
            i+=2;
            j+=2;
         }
         else if(charcters[i] == '-' && charcters[j] == '-'){
            cout << 2;
            i+=2;
            j+=2;
         }
      
   }
}
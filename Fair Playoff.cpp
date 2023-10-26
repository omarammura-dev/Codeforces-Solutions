#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int t, f1, f2;
   cin >> t;
   vector<int> v(4); // Initialize the vector with 4 elements.

   while (t--)
   {
      for (int i = 0; i < 4; i++)
      {
         cin >> v[i];
      }
      f1 = max(v[0], v[1]);
      f2 = max(v[2], v[3]);
      sort(v.begin(), v.end());
      if ((f1 == v[2] && f2 == v[3]) || (f1 == v[3] && f2 == v[2]))
      {
         cout << "YES" << '\n';
      }
      else
      {
         cout << "NO" << '\n';
      }
   }
}

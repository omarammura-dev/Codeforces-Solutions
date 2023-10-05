#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int t,n,diff;
   cin >> t;
   while(t--)
   {
      cin >>n;
      int array[n];
      int arr[n];

      for(int i=0;i<n;i++)
      {
         cin >> array[i];
      }
      copy(array,array+n,arr);
      sort(arr,arr+n);
      if(arr[0] == arr[1] )
      {
         diff= arr[n-1];
      }
      else
      {
         diff=arr[0];
      }
      for(int i =0; i<n;i++)
      {
         if (array[i] == diff)
         {
            cout << i+1 << '\n';
            break;
         }
      }

   
   }
}
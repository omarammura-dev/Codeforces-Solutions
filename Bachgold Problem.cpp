#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool isPrime(int number){

    if(number < 2) return false;
    if(number == 2) return true;
    if(number % 2 == 0) return false;
    for(int i=3; (i*i)<=number; i+=2){
        if(number % i == 0 ) return false;
    }
    return true;

}

int main()
{
  int n,temp=0,counter;
  cin >> n;

  if (n == 2)
  {
      cout << 1<<'\n';
      cout << 2;
  }
  else if ( n%2 == 0 )
  {
      cout << n/2 << '\n';

      for(int i=0; i<n/2; i++){
         cout << 2 << " ";
    }
  }
  else
  {
      temp = n-3;
      cout << (temp/2)+1 << '\n';
   for(int i=0; i<temp/2; i++){
         cout << 2 << " ";
    }
    cout << 3;
  }

}

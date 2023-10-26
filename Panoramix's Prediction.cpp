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
  int n,m;
  bool status=false;
  cin >> n >> m;

  for(int i= n+1; i<=m;i++)
  {
      if(isPrime(i) && i!=m || (i == m && !isPrime(m)))
      {
         cout << "NO";
         status = true;
         break;
      }
  }
  if(!status && isPrime(m))
  {
   cout << "YES";
  }
}

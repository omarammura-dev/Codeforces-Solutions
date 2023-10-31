#include <iostream>
#include <bits/stdc++.h>
using namespace std;



int main()
{
    int x,last_digit,temp;
    cin >> x;
    last_digit = x % 10;

    if(x % 5 == 0)
    {
        cout << x/5;
    }  
    else
    {
        if (last_digit > 5)
        {
            temp = last_digit-5;
        }
        else if(last_digit < 5){
            temp = last_digit;
        }
       
       x -=temp;
        cout << (x/5)+1; 
    }
}

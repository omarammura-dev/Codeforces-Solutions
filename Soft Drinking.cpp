#include <iostream>
using namespace std;
#include <algorithm>
int main()
{ 
    int arr[3];
    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p>> nl>> np;
 
    arr[0]   = (k*l)/nl;
    arr[1] = c*d;
    arr[2] = p/np;
    int *ans = min_element(arr,arr+3);
    cout<< *ans/n;
    
 
}
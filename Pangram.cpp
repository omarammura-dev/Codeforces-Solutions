#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    string s;
   cin >> n >> s;

    std::transform(s.begin(), s.end(), s.begin(),[](unsigned char c){ return std::tolower(c); });
   set<char> ss(s.begin(),s.end());
   if(26 == ss.size()) cout << "YES";
   else cout << "NO";


    return 0;
}

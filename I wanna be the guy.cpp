#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,p,q;
    set<int> levels;
    cin >> n >>p;

    copy_n(istream_iterator<int>(cin),p, inserter(levels,levels.begin()));
    cin >> q;
    copy_n(istream_iterator<int>(cin),q, inserter(levels,levels.begin()));

    if (n == levels.size()) cout << "I become the guy.";
    else cout<<"Oh, my keyboard!";
    return 0;
}

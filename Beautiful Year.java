#include <iostream>
#include <algorithm>
using namespace std;

int unique(long long int number)
{
    char seen[10] = {0};

    while (number) {
        int digit = number % 10;
        number /= 10;

        if (seen[digit]++)
            return 0; /* not unique */
    }
    return 1; /* unique */
}
int main() {
    int i;
    cin >> i;
    i +=1;
    while (true)
    {
        if (unique(i))
        {
            cout<< i;
            break;
        }
        else
            i++;
    }
}
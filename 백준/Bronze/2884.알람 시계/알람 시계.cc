#include <iostream>
using namespace std;

int main()
{
    int H,M;
    cin >> H >> M;
    
    if ((45<=M)&&(M<=59))
    {
        cout << H << " " << M-45;
    }
    else if ((0<=M)&&(M<=44))
    {
        if (H==0)
        {
            cout << 23 << " " << 60+(M-45);
        }
        else if ((1<=H)&&(H<=23))
        {
            cout << H-1 << " " << 60+(M-45);
        }
    }
    return 0;
}
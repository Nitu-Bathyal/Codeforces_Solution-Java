#include <bits/stdc++.h>
using namespace std;
int main()
{
    int row1[5], row2[5], row3[5], row4[5], row5[5];
    int r, c;
    int moves = 0;

    for (int i = 0; i < 5; i++){
        cin >> row1[i];
        if (row1[i] == 1)
        {
            r = 0;
            c = i;
        }
    }
    for (int i = 0; i < 5; i++){
        cin >> row2[i];
        if (row2[i] == 1)
        {
            r = 1;
            c = i;
        }
    }
    for (int i = 0; i < 5; i++){
        cin >> row3[i];
        if (row3[i] == 1)
        {
            r = 2;
            c = i;
        }
    }
    for (int i = 0; i < 5; i++){
        cin >> row4[i];
        if (row4[i] == 1)
        {
            r = 3;
            c = i;
        }
    }
    for (int i = 0; i < 5; i++){
        cin >> row5[i];
        if (row5[i] == 1)
        {
            r = 4;
            c = i;
        }
    }
    while (r < 2)    {
        if (r == 0)
            swap(row1[c], row2[c]);
        else if (r == 1)
            swap(row2[c], row3[c]);

        r++;
        moves++;
    }
    while (r > 2)    {
        if (r == 4)
            swap(row5[c], row4[c]);
        else if (r == 3)
            swap(row4[c], row3[c]);

        r--;
        moves++;
    }
    while (c < 2){
        if (r == 2)
            swap(row3[c], row3[c + 1]);

        c++;
        moves++;
    }
    while (c > 2){
        if (r == 2)
            swap(row3[c], row3[c - 1]);

        c--;
        moves++;
    }
    cout << moves << endl;
    return 0;
}
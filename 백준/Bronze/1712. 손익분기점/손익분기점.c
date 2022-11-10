#include<stdio.h>

int main() {
    unsigned int A;
    int B, C;
    int diff;
    int  n = 0;
    scanf("%d %d %d", &A, &B, &C);

    diff = C - B;
    if (B >= C) {
        n = -1;
    }
    else {
       n = A/diff +1;
    }
    printf("%d\n ", n);
}
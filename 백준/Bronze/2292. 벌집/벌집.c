#include<stdio.h>

int main() {
    int a, n = 1, sum = 1;
    scanf("%d", &a);
    if (a == 1) {
        n = 1;
    }
    else {
        while (1) {
            if (a > sum + 6 * n ) {
                sum += 6 * n;
                n++;
            }
            else {
                n++;
                break;
            }
        }
    }

    printf("%d", n);
}
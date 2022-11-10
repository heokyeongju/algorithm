#include<stdio.h>
#pragma warning(disable : 4996)

int main() {
    int t;
    int k, n;
    scanf("%d", &t);
    
    int arr[15][15] = {0,}; // 0층 ~ 14층

    for (int i = 1; i < 15; i++) {
        arr[0][i] = i;
        arr[i][1] = 1;
    }

    for (int i = 1; i < 15; i++) {
        for (int j = 1; j < 15; j++) {
            arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
        }
    }

    for (int i = 0; i < t; i++) {
        scanf("%d %d", &k, &n);
        printf("%d\n", arr[k][n]);
    }

}
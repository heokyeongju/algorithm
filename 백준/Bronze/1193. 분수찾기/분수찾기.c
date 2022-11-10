#include<stdio.h>
int main() {
    int num = 0;
    int sum = 0;

    scanf("%d", &num);

    for (int i = 1; i > 0; i++) {
        sum += i;
        if (num <= sum) {
            if (i % 2 == 0) {
                printf("%d/%d", num - sum + i, sum - num + 1);
            }
            else {
                printf("%d/%d", sum - num + 1, num - sum + i);
            }
            break;
        }
    }
}
#include<stdio.h>

int main() {
    int num,n;
    int min=1000001, max=-1000001;
    scanf("%d", &n);
    for(int i = 0; i<n ; i++){
        scanf("%d", &num);
        if(num < min){
            min = num;
        }
        if(num > max){
            max = num;
        }
    }
    printf("%d %d", min, max);
}
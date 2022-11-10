#include<stdio.h>
int main(){
    int num=0;
    int arr[9];
    int a;
    for(int i=0; i<9; i++){
        scanf("%d", &arr[i]);
        if(arr[i]>num){
            num = arr[i];
            a=i;
        }
    }
    printf("%d %d",num, a+1);
}
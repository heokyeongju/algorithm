#include<stdio.h>

int main(){
    int h,m;
    scanf("%d %d",&h,&m);
    if(m<45){
        if(h==0){
            h=23;
        }
        else{
             h--;
        }
         m=m+15;
    }
    else{
        m=m-45;
    }
    printf("%d %d",h,m);
}
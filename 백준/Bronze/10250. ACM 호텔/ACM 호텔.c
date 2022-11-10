#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int t;
  int h,w,n;
  int x; // 호
  int y; // 층
  scanf("%d",&t);
  
  int* res = malloc(sizeof(int)*t); // res를 담을 공간
  
  for(int i = 0; i < t; i++){
    scanf("%d %d %d", &h, &w, &n);
    if(n%h==0){
        y = h;
        x = n/h;
    }else{
        x = n/h+1;
        y = n%h;
      }
      res[i] = y*100+x; 
  }
  for(int i = 0; i < t ; i++){
    printf("%d\n", res[i]);
  }
}
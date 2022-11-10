#include<stdio.h>
#include<math.h>

int main() {
    double A, B, V;
    int day = 0;
    scanf("%lf %lf %lf", &A, &B, &V);
    
    day = (int)(ceil((V - B) / (A - B)));
    
    printf("%d", day);


}
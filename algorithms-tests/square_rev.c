#include <stdio.h>

void square_reverse(double *x, double *y, int len){
    int j = len -1;
    for(int i= 0; i<len; i++){
        y[j]=x[i]*x[i];
        j--;
    }
}

int main(){
    double in[]={11.0, 20.0, 100.0};
    double out[3];

    square_reverse(in, out, 3);
    for(int i = 0; i <3; i++){
        printf("%.2f\n", out[i]);
    }
}
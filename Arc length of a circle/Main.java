#include<stdio.h>
int main()
{
 float arc,rad,x;
  scanf("%f %f",&arc,&rad);
  x=arc/360*(2*3.14*rad);
  printf("%.2f",x);
  return 0;
}
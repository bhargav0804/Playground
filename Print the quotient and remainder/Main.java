#include<stdio.h>
int main()
{
  int n,x;
  scanf("%d %d",&n,&x);
  int w,d;
  w=365/4;
  d=365%4;
  printf("Quotient: %d\nRemainder: %d",w,d);


  return 0;
}
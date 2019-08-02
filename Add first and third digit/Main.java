#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int x,y;
  x=n/100;
  y=n%10;
  int z;
  z=x+y;
  printf("%d",z);
  return 0;
}
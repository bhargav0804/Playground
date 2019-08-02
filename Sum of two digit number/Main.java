#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int x,y,z;
  x=n/10;
  y=n%10;
  z=x+y;
  printf("%d",z);
  return 0;
}
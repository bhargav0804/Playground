#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int x,y;
  x=n%100;
  y=x/10;
  printf("%d",y);
  return 0;
}
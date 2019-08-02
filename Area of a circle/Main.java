#include<stdio.h>
int main()
{
  int n;
  float r,area;
  scanf("%d",&n);
  r=(float)n/2;
  area=3.14*r*r;
  printf("%.2f",area);
  return 0;
}
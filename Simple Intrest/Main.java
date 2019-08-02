#include<stdio.h>
int main()
{
  float m,n;
  float p,simpleinterest;
  scanf("%f %f",&m,&n);
  scanf("%f",&p);
  simpleinterest=(m*n*p)/100;
  printf("%f",simpleinterest);
  return 0;
}
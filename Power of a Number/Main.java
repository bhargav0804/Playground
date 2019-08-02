#include <stdio.h>
int main()
{
  	int x,n,i,pow=1;
  scanf("%d %d",&x,&n);
  if(n>=0)
  {
    for(i=1;i<=n;i++)
    {
      pow=pow*x;
    }
    printf("%d",pow);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}
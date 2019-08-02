#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int first,last,sum;
  if(n>10000)
  {
  first=n/10000;
   last=n%10;
    sum=first+last;
    printf("%d",sum);
  }
  else
  {
    first=n/1000;
    printf("%d",first);
  }
	return 0;
}
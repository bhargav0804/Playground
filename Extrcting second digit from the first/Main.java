#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int digit,sec;
  if(n>100)
  {
    digit=n/1000;
    sec=digit%10;
    printf("%d",sec);
  }
  else
  {
    digit=n%10;
    printf("%d",digit);
  }
	return 0;
}
#include <stdio.h>
int main() {
	int num,original_num,remainder,result=0;
  scanf("%d",&num);
  original_num=num;
  while(original_num!=0)
  {
    remainder=original_num%10;
    result=result+remainder*remainder*remainder;
    original_num/=10;
  }
  if(result==num)
    printf("Armstrong Number");
    else
      printf("Not an Armstrong Number");


	return 0;
}
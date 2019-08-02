#include <stdio.h>
int main() {
	char c;
  scanf("%c",&c);
  if('A'<=c && c<='Z')
  {
    printf("%c", 'a'+(c-'A'));
  }
  if('a'<=c && c<='z')
 {
   printf("%c", 'A'+(c-'a'));
}
	return 0;
}
#include <stdio.h>
int main() {
	// Type your code here
  char a;
  scanf("%c",&a);
  if(a>=65 && a<=90)
  {
    a=a+32;
    printf("%c",a);
  }
  else{
    a=a-32;
  printf("%c",a);}
	return 0;
}
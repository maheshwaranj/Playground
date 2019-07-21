// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,n;
  scanf("%d %d",&a,&b);
  if(a<b)
    n=a;
  else n=b;
  int i;
  for(i=n;i>=1;i--)
  {
    if(a%i==0&&b%i==0)
    {  printf("%d",i);
    break;}
  }
  
   return 0;
}
#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,i;
  scanf("%d %d",&a,&b);
  if(a<b)
    i=a;
  else i=b;
  int g,l;
  for(;i>=1;i--)
  {
    if(a%i==0&b%i==0){
      g=i;
    break;}}
    l=(a*b)/g;
    printf("%d",l);
  return 0;
}
#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here  
  int b,e; long int p;
  scanf("%d %d",&b,&e);
  if(e>=0){
  p=pow(b,e); 
  printf("%ld",p);}
  else printf("Wrong input");
  
    return 0;
}
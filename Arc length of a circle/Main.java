#include<stdio.h>
int main()
{
  float PI=3.14,r,l,a;
  scanf("%f %f ",&r,&a);
  l=a*PI/180*r;
  printf("%.2f",l);
  return 0;
}
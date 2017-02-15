#include<iostream>
using namespace std;
#include<stdio.h>
main()
{
	int a[9]={-2,1,-3,4,-1,2,1,-5,4};
	int high=0,sum;
	for(int i=0;i<9;i++)
	{
		sum=0;
		for(int j=i;j<9;j++)
		{
			
		sum=sum+a[j];
		if(sum>high)
		high=sum;
		}
      		
	}
	cout<<high;
}

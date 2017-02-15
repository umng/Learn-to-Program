#include<iostream>
using namespace std;
main()
{
	int a[]={1,2,3,4,5};
	int k=3;
	int sum=0;
int	max;
    for(int i=0;i<k;i++)
	{
	sum+=a[i];
		
	}
	max=sum;
	for(int i=k;i<5;i++)
	{
	sum+=a[i]-a[i-k];
	if(sum>max)
	{
		max=sum;
	}	
	}
	cout<<max;
}

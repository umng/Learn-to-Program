#include<iostream>
using namespace std;
int max(int a,int b)
{
	if(a>b)
	return a;
	else
	return b;
}
int maxsum(int a[],int n)
{
	if(n==0)
	{
		return a[n];
	}
	if (n==1)
	{
		return a[n];
	}
	max(maxsum(a,n-1),maxsum(a,n-2)+a[n]);
}

main()
{
	int a[]={1,2,3,4,5};
	int n=5,c;
	c=maxsum(a,n);
	cout<<c;
}

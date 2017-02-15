#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
	int *temp;
	*temp=*a;
	*a=*b;
	*b=*temp;
}
void zigzag(int a[] ,int n)
{
	int flag=0;
	for(int i=0;i<n-2;i++)
	{
	
	
		if(flag%2==0)
		{
		if(a[i]>a[i+1])
		swap(&a[i],&a[i+1]);
		}
	    else 
		{
		if (a[i]<a[i+1])
		swap(a[i],a[i+1]);
		}
		flag=flag+1;
	
}
}

main()
{
	int arr[]={1,2,3,4,6};
	zigzag(arr,5);
	for(int i=0;i<5;i++)
	{
		cout<<arr[i];
	}
}

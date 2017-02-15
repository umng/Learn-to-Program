#include<iostream>

using namespace std;

void merge(int arr[],int i,int mid,int j)
{
	int k;
	int c[100];
	int n=mid;
	int m=j;
	int a=i;
	int b=mid+1;
	for(k=0;a<=n&&b<=m;k++)
	{
		if(arr[a]<arr[b])
		{
			c[k]=arr[a];
			a++;
		}
		else{
		
		c[k]=arr[b];
		b++;}
	}
	
	for(;a<=n;)
	c[k++]=arr[a++];
	
	for(;b<=m;)
	c[k++]=arr[b++];
	
	for(k=0;k<j-i+1;k++)
    arr[k]=c[k];
	
}
void mergesort(int arr[],int i,int j)
{
	int m;
	if(i<j)
	{
		m=(i+j)/2;
		mergesort(arr,i,m);
		mergesort(arr,m+1,j);
		merge(arr,i,m,j);
	}
}

int main()
{
	int arr[]={3,7,2,5,6,1};
	mergesort(arr,0,5);
	
	for(int i=0;i<6;i++)
	cout<<arr[i]<<endl;
}

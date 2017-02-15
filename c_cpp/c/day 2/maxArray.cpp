#include<iostream>

using namespace std;

int max(int arr[],int N,int m)
{
	if(N<0)
	return m;
	if(arr[N]>m) m=arr[N];
	max(arr,N-1,m);
}
int main()
{
	int arr[]={1,2,3,4,5};
	
	cout<<"MAX = " <<max(arr,4,0);
}

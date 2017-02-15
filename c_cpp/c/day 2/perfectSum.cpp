#include<iostream>
using namespace std;
int c=0;
void perfSum(int arr[],int i,int k,int sum,int key)
{
	if(i==k)
	{
		if(sum==key) c++;
 	}
 	else
 	{
 		perfSum(arr,i+1,k,sum+arr[i],key);
 		perfSum(arr,i+1,k,sum,key);
 	}
}

int main()
{
	int arr[]={2,4,1,3,5,6,-1};
	
	perfSum(arr,0,7,0,4);
	cout<<c;
}

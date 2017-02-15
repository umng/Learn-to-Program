#include<iostream>
using namespace std;

int main(){
	int arr1[]={4,5,7,5};
	int arr2[]={6,4,3,6};
	int N=4;
	int arr3[N];
	for(int i=0;i<N;i++){
		arr3[i]=arr1[i]-arr2[i];
	}

	int x=0;
	int y=0;
	int sum=0;
	int count=0;
	while(count<=N)
	{
		sum=sum+arr3[y];
		y=(y+1)%N;
		count++;
		if(sum<0)
		{
			sum=sum-arr3[x];
			x=(x+1)%N;
			count--;
		}
	}
	cout<<x;
	
}

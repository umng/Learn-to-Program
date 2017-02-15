#include<iostream>

using namespace std;

int sum(int arr[],int i,int N)
{
	if(i==N)
	return arr[i];
	 int m= ( i+N)/2;
	return sum(arr,i,m) + sum(arr,m + 1,N);
}
int main()
{
	int arr[]={1,2,3,4,5};
	
	cout<<"Sum = " <<sum(arr,0,4);
}

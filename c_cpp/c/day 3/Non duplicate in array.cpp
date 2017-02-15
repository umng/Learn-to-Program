#include<iostream>

using namespace std;

int main()
{
	int ar[]={1,3,4,5,2,3,4,1,5};
	int x=ar[0];
	for(int i=1;i<9;i++ )
	x=x^ar[i];
	
	cout<<x;
}

#include<iostream>
using namespace std;
int max(int a,int b)
{
	if(a>b)
	return a;
	else
	return b;
}
main()
{
	int a[]={ 10,15,2,25};
	int include=a[0];
	int temp;
	int d;
	int exclude=0;
	for(int i=1;i<4;i++)
	{
	temp=exclude;
	exclude=max(include,exclude);
	include=temp+a[i];
		
	}
    d=max(include,exclude);
    cout<<d;
}

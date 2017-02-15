#include<iostream>
using namespace std;
main()
{
	int min=9999;
	int max=-9999;
	int a[]={1,2,3,4,5};
	for(int i=0;i<5;i++)
	{
		if(a[i]>max)
		{max=a[i];}
		if(a[i]<min)
        {min=a[i];}
	}
	
	cout<<max-min;
}

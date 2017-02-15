#include<iostream>
using namespace std;
main()
{
	int i,j,k=10;
	int arr1[]={1,4,5,6,7};
	int arr2[]={9,10,11,12,13};
	for(i=0,j=5;i<5&&j>0;)
	{
	if(arr1[i]+arr2[j]>k)
		j--;
	else if(arr1[i]+arr2[j]<k)
	      i++;
	      else if(arr1[i]+arr2[j]==k)
		        cout<<arr1[i]<<arr2[j];
		    }
	      
	
	
}

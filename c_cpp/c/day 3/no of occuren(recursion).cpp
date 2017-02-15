#include<iostream>

using namespace std;
int count=0;
int flag=0;
int binSearch(int arr[],int key,int low,int high)
{
int mid;
if(low>high)
return 0;

mid=(low+high)/2;

if(arr[mid]==key)
{
	flag=1;
	count++;
	binSearch(arr,key,low,mid-1);
	binSearch(arr,key,mid+1,high);
}
else if(arr[mid]>key)
	binSearch(arr,key,low,mid-1);
else binSearch(arr,key,mid+1,high);
 
}
int main()
{
	int ar[100],key,len,index;
	cout<<"Enter array length = ";
	cin>>len;
	cout<<" Enter Array \n";
	for(int i=0;i<len;i++)
	{	
	 cin>>ar[i];
	}
	
	cout<<"\nEnter the key to find";
	cin>>key;
  binSearch(ar,key,0,len-1);
	if(flag==0)
	cout<<"Not found key, ";
	else cout<<" Count =  "<<count;
}

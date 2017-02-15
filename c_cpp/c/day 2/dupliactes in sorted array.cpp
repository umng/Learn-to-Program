#include<iostream>

using namespace std;
int fir,las,flag=0;
void first(int arr[],int key,int high)
{
int low=0;
int mid;

while(low<=high){
	mid=(low+high)/2;
	if(arr[mid]==key)
	{
		flag=1;
		fir=mid;
		high=mid-1;
	}
	else if(arr[mid]>key)
	high=mid-1;
	else low=mid+1;
 }

}
void last(int arr[],int key,int high)
{
int low=0;
int mid;

while(low<=high){
	mid=(low+high)/2;
	if(arr[mid]==key)
	{
		las=mid;
		low=mid+1;
	}
	else if(arr[mid]>key)
	high=mid-1;
	else low=mid+1;
 }

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
first(ar,key,len-1);
last(ar,key,len-1);
if(flag==1)
 cout<<" occurences =  "<<las-fir+1;
 else cout<<" Element Not Present in array "; 
}

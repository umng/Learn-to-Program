#include<iostream>

using namespace std;
int flag=0;
int binSearch(int arr[],int key,int high)
{
int low=0;
int mid;

while(low<=high){
	mid=(low+high)/2;
	if(arr[mid]==key)
	return mid;
	
	if(arr[mid]>key)
	high=mid-1;
	else low=mid+1;
 }
 flag=1;
 return low;

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
	index=binSearch(ar,key,len-1);
	if(flag==1)
	cout<<"Not found key, Deserving at "<<index;
	else cout<<" found at "<<index;
}

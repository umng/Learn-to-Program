#include<iostream>

using namespace std;
int flag=0;
int squareRoot(int low,int key,int high)
{
int mid;

while(low<=high){
	mid=(low+high)/2;
	if(mid*mid==key)
	return mid;
	
	if(mid*mid>key)
	high=mid-1;
	else low=mid+1;
 }
 flag=1;
 return high;

}
int main()
{
	int key,index;
	cout<<"Enter the Num to find sqrt";
	cin>>key;
	index=squareRoot(1,key,key/2);
	if(flag==1)
	cout<<"lower bound square "<<index;
	else cout<<"Perf square of "<<index;
}

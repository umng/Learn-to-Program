#include<iostream>
using namespace std;
int a[4][4]={0};
main()
{   int A=4;
	int n=1;
	int i=0,j=0;
	while(n<=A*A){
	while(j<A&& n<=A*A && a[i][j]==0) a[i][j++]=n++;
	i++;j--;	
	while(i<A&& n<=A*A && a[i][j]==0) a[i++][j]=n++;
	i--;j--;
	while(j>=0 && n<=A*A && a[i][j]==0) a[i][j--]=n++;
	i--;j++;
	while(i>=0 && n<=A*A && a[i][j]==0) a[i--][j]=n++;
	i++;j++;
}
for(i=0;i<A;i++)
{
	for(j=0;j<A;j++)
	cout<<a[i][j];
	cout<<"\n";
}
}

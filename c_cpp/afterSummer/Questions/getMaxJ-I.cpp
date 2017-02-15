#include <iostream>

using namespace std;

int maxDiff(int arr[], int n)

int getMax(int a[], int n)
{
	int i=0, j=n-1;
	while(i<j)
	{
		if(a[i]<a[j])
			return j-i;
		if(a[i]>a[j] && a[i]>a[j-1])
			i++;
		else
			j--;
	}
	return -1;
}

int main(int argc, char const *argv[])
{
	int a[] = {34,8,10,3,2,80,30,35,1};
	int b[] = {9,2,3,4,5,6,7,8,18,0};
	int c[] = {1,2,3,4,5,6};
	// int d[] = {6,5,4,3,2,1};
	int d[] = {7,6,100,4,3,2,1};
	cout<<getMax(a, 9)<<endl<<getMax(b,10)<<endl<<getMax(c,6)<<endl<<getMax(d,7)<<endl;

	return 0;
}

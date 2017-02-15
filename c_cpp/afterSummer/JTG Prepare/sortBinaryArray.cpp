#include <iostream>

using namespace std;

void sortBinaryArray(int a[], int n)
{
	int i=0, j=n-1;

	while(i<j)
	{
		while(a[i]==0)
			i++;
		while(a[j]==1)
			j--;
		if(i<j)
			swap(a[i],a[j]);
	}
	for (i = 0; i < n; i++)
		cout<<a[i]<<"\t";
}

int main(int argc, char const *argv[])
{
	int a[] = {0,0,1,0,0,1,1,0};
	int b[] = {1,0,0,1,1,1};
	sortBinaryArray(a,sizeof(a)/sizeof(a[0]));
	cout<<endl;
	sortBinaryArray(b,sizeof(b)/sizeof(b[0]));

	return 0;
}

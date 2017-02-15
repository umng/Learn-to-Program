#include <iostream>

using namespace std;

void printSumPair(int a[], int n, int x)
{
	int i= 0, j= n-1, sum = 0;

	while(i<j)
	{
		sum = a[i] + a[j];
		if(sum == x)
		{
			cout<<a[i]<<"\t"<<a[j]<<endl;
			break;
		}
		else if(sum > x)
			j--;
		else
			i++;
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {1,5,10,0,16};
	printSumPair(a,sizeof(a)/sizeof(a[0]),6);

	return 0;
}
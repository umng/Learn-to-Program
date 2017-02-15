#include <iostream>

using namespace std;

int getMax(int a, int b)
{
	if(a > b)
		return a;
	else
		return b;
}

int maxSumIncreasingSubSequence(int a[], int n)
{
	int temp[n] = {0};
	int maxSum = 0, j = 0;

	if(n <= 1)
		return a[0];

	temp[0] = a[0];
	for (int i = 1; i < n; i++)
	{
		j = i - 1;
		while(a[i] < a[j])
		{
			if(j<=0)
				break;
			j--;
		}
		temp[i] = a[i] + temp[j];
		maxSum = getMax(maxSum, temp[i]);
	}
	return maxSum;
}

int main(int argc, char const *argv[])
{
	int a[] = {1, 101, 2, 3, 100, 4, 5};
	int b[] = {100, 101, 1, 2, 3, 4};
	int c[] = {10, 15, 11, 12, 13};

	cout<<maxSumIncreasingSubSequence(a, sizeof(a)/sizeof(a[0]))<<endl;
	cout<<maxSumIncreasingSubSequence(b, sizeof(b)/sizeof(b[0]))<<endl;
	cout<<maxSumIncreasingSubSequence(c, sizeof(c)/sizeof(c[0]))<<endl;

	return 0;
}
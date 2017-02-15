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
	int LIS[n] = {0}, LDS[n] = {0};
	int max = 0;

	if(n <= 1)
		return 1;

	for (int i = 1; i < n; i++)
	{
		for (int j = 0; j < i; j++)
		{
			if(a[i] > a[j] && LIS[i] < LIS[i] + 1)
				LIS[i] += 1;
		}
	}

	for (int i = n-2; i >= 0; i--)
	{
		for (int j = n-1; j > i; j--)
		{
			if(a[i] > a[j] && LDS[i] < LDS[i] + 1)
				LDS[i] += 1;
		}
	}
 
	for (int i = 0; i < n; i++)
	{
		max = getMax(max, LIS[i] + LDS[i] - 1);
	}


	return max;
}

int main(int argc, char const *argv[])
{
	int a[] = {1, 11, 2, 10, 4, 5, 2, 1};
	int b[] = {4, 5, 3, 2, 1, 40};
	int c[] = {80, 60, 30, 40, 20, 10};
	int d[] = {12, 11, 40, 5, 3, 1};

	cout<<maxSumIncreasingSubSequence(a, sizeof(a)/sizeof(a[0]))<<endl;
	cout<<maxSumIncreasingSubSequence(b, sizeof(b)/sizeof(b[0]))<<endl;
	cout<<maxSumIncreasingSubSequence(c, sizeof(c)/sizeof(c[0]))<<endl;
	cout<<maxSumIncreasingSubSequence(d, sizeof(d)/sizeof(d[0]))<<endl;

	return 0;
}
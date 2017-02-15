#include <stdio.h>

int A[100][100] = {0};
int c = 0, s = 0;

int max(int x, int y)
{
	return (x > y) ? x : y;
}

int knapSack(int cap, int P[], int W[], int n)
{
	c++;
	if(cap <= 0)	return 0;
	if(n < 0) return 0;
	else
	{
		if(A[cap][n] != 0)
		{
			return A[cap][n];
		}
		if(W[n] <= cap)
			A[cap][n] = max( P[n] + knapSack(cap - W[n], P, W, n - 1), knapSack(cap, P, W, n - 1) );
		else
			A[cap][n] = knapSack(cap, P, W, n - 1);
		return A[cap][n];
	}
}

int main(int argc, char const *argv[])
{
	int n = 5;
	int capacity = 17; 
	int P[] = {10, 25, 4, 3, 2};
	int W[] = {5, 1, 8, 7, 11};
	printf("Maximum Profit:\t%d\n", knapSack(capacity, P, W, n));
	printf("Time Complexity:\t%d\n", c);
	return 0;
}
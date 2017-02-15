#include <stdio.h>

int c = 0, s = 0;

int max(int x, int y)
{
	return (x > y) ? x : y;
}

int knapSack(int cap, int P[], int W[], int profit, int n)
{
	c++;
	if(n >= 0)
	{
		if(W[n] <= cap)
			return max(knapSack(cap - W[n], P, W, profit + P[n], n - 1), knapSack(cap, P, W, profit, n - 1) );
		else
			return knapSack(cap, P, W, profit, n - 1);
	}
	else
		return profit;
}

int main(int argc, char const *argv[])
{
	int n = 5;
	int capacity = 17; 
	int P[] = {10, 25, 4, 3, 2};
	int W[] = {5, 1, 8, 7, 11};
	printf("Maximum Profit:\t%d\n", knapSack(capacity, P, W, 0, n));
	printf("Time Complexity:\t%d\n", c);
	return 0;
}
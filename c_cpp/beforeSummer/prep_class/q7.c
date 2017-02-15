#include <stdio.h>

int c = 0, cnt = 0;

int func(int a[], int k, int i, int sum, int n)
{
	if(i == n)
	{
		if(sum == k)	cnt++;
	}
	else
	{
		func(a, k, i + 1, sum + a[i], n);
		func(a, k, i + 1, sum, n);
	}
	c++;
	return 0;
}

int main(int argc, char const *argv[])
{
	int a[] = {2, 4, 1, 3};
	func(a, 4, 0, 0, 4);
	printf("Number of Pairs:\t%d\nComplexity:\t%d\n", cnt, c);
	return 0;
}

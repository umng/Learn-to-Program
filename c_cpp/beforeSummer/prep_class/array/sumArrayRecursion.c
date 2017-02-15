#include <stdio.h>

int getSum(int a[], int n)
{
	if(n == 1)	return a[0];
	return a[n] + getSum(a, n - 1);
}

int main(int argc, char const *argv[])
{
	int a[11] = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -10, 12};
	printf("Sum:\t%d\n", getSum(a, 11));
	return 0;
}

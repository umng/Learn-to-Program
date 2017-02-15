#include <stdio.h>

int max(int a, int b)
{
	return (a > b) ? a : b;
}

int main(int argc, char const *argv[])
{
	int a[] = {2, -1, 5, -3, 9, -9};
	int c = 0, maxSum = a[0], temp = a[0], i;

	for(i = 1; i < 6; i++)
	{
		temp = max(temp + a[i], a[i]);
		if(temp > maxSum)	maxSum = temp;
		c++;
	}

	printf("Maximumu Sum:\t%d\nComplexity:\t%d\n", maxSum, c);
	return 0;
}

#include <stdio.h>

int getMaxSumArray(int a[], int l)
{
	int i = 0, j = 0, sum = 0, lsum = a[0], c = 0;

	//block size of contigous elements
	i = 0;
	sum = 0;
	//sub arrays
	for(j = 0; j < l; j++)
	{
		sum += a[j];
		c++;
		if(sum > lsum)
			lsum = sum;
	}
	printf("\nComplexity:\t%d\n", c);
	return lsum;
}


int main(int argc, char const *argv[])
{
	int a[11] = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -10, 12};
	printf("Sum:\t%d\n", getMaxSumArray(a, 11));

	return 0;
}
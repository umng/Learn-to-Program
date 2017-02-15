#include <stdio.h>

int c1, c2, cSum = 0, c;

int getClosest(int n, int a[], int x)
{
	int y = 0, i = 0, j = n - 1, sum = -9999;
	while(i < j)
	{
		cSum = sum;
		sum = a[i] + a[j];
		if(sum == x)
		{
			c1 = i;
			c2 = j;
			cSum = x;
			break;
		}
		else if( (x - sum) < (x - cSum) )
		{
			c1 = i;
			c2 = j;
			cSum = sum;
			// printf("%d\n", cSum);
			j--;
		}

		if(sum <= x)
		{
			i++;
		}
		else
		{
			j--;
		}
		y++;
		c++;
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {10, 22, 28, 29, 30, 40};
	// int a[] = {-10, -5, -2, 0, 6, 9, 11};
	getClosest(7, a, 52);
	printf("C1:\t%d\nC2:\t%d\nSum:\t%d\nComplexity:\t%d\n", c1, c2, cSum, c);

	return 0;
}
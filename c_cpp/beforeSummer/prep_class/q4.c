#include <stdio.h>

int m, max1, max2;

int maxArray(int a[], int i, int j)
{
	if( (j - i) == 0)	return a[i];
	else
	{
		m = (i + j) / 2;
		max1 = maxArray(a, i, m);
		max2 = maxArray(a, m + 1, j);
		if(max1 > max2)	return max1;
		else return max2;
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {3, 1, 2, 5, 10, 1, 4};
	printf("Max:\t%d\n", maxArray(a, 0, 7));
	return 0;
}

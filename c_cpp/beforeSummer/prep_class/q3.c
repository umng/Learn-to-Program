#include <stdio.h>

int sumArray(int a[], int x, int y)
{
	// if( (y - x) == 1)	return a[x] + a[y];
	// if( (y - x) == 0)	return a[x];
	// if( ( (y - x) % 2) == 0)	return sumArray(a, x, (y/2) ) + sumArray(a, (y/2) + 1, y);
	// if( ( (y - x) % 2) == 1)	return sumArray(a, x, (y/2) - 1 ) + sumArray(a, (y/2) , y);

	if( (y - x) == 0)	return a[x];
	else
	{
		int m = (x + y) / 2;
		return sumArray(a, x, m) + sumArray(a, m + 1, y);
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {3, 1, 2, 5, 4, 5, 4, 9};
	printf("Sum:\t%d\n", sumArray(a, 0, 7));
	return 0;
}

#include <stdio.h>

int partition(int a[], int lower, int upper)
{
	int i, p, q, t;
	p = lower + 1;
	q = upper;
	i = a[lower];

	while(q >= p)
	{
		while(a[p] <= i)
			p++;
		while(a[q] >= i)
			q--;
		if(q > p)
		{
			t = a[p];
			a[p] = a[q];
			a[q] = t;
		}
	}
	t = a[lower];
	a[lower] = a[q];
	a[q] = t;

	return q;
}

void quickSort(int a[], int lower, int upper)
{
	int i = 0;
	if(upper > lower)
	{
		i = partition(a, lower, upper);
		quickSort(a, lower, i - 1);
		quickSort(a, i + 1, upper);
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {10, 5, 8, 11, 1, 3, 2};
	int i = 0, n = 6;
	printf("Array:\t");
	for(i = 0; i < n; i++)
		printf("%d\t", a[i]);

	quickSort(a, 0, n);
	printf("\n\nSorted Array:\t");
	for (int i = 0; i < n; i++)
		printf("%d\t", a[i]);

	return 0;
}
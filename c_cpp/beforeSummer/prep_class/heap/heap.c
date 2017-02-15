#include <stdio.h>

void heapify(int arr[], int n, int i)
{
	int l, r, small, temp;
	l = 2 * i;
	r = l + 1;
	small = i;
	if(l <= n && arr[l] < arr[i])
		small = l;
	if(r <= n && arr[r] < arr[small])
		small = r;
	if(small != i)
	{
		temp = arr[i];
		arr[i] = arr[small];
		arr[small] = temp;
		heapify(arr, n, l);
	}
}

void buildHeap(int arr[], int n)
{
	int i = 0;
	for(i = (n/2); i > 0; i /= 2)
	{
		heapify(arr, n, i);
	}
}

int main(int argc, char const *argv[])
{
	int a[] = {10, 12, 8, 2, 5, 6};
	int n = 6;
	printf("Array:\t");
	for (int i = 0; i < n; i++)
		printf("%d\t", a[i]);

	buildHeap(a, 6);

	printf("\n\nSorted Array:\t");
	for (int i = 0; i < n; i++)
		printf("%d\t", a[i]);

	return 0;
}
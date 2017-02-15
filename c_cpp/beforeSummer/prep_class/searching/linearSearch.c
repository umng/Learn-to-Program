#include <stdio.h>

int c = 0;

int linearSearch(int a[], int key, int n)
{
	int i = 0;
	for(i = 0; i < n; i++)
	{
		if(a[i] == key)	return i;
		c++;
	}
	return -1;
}

int main(int argc, char const *argv[])
{
	int a[] = {2, 3, 1, 7, 0, 5};
	int key = 0, n = 6;
	printf("Complexity:\t%d\nElement %d is at position:\t%d\n", c, key, linearSearch(a, key, n) );
	return 0;
}
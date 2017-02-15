#include <stdio.h>

int c = 0, ans = 0;

int binarySearch(int a[], int key, int n)
{
	int i = 0, j = n - 1, m = 0, ans = -1;
	while(i <= j)
	{
		m = (i + j) / 2;
		if(a[m] == key)
		{
			ans = m;
			break;
		}
		else if(key < a[m])
		{
			j = m - 1;
			ans = 0;
		}
		else	i = m + 1;
		c++;
	}
	return ans;
}

int main(int argc, char const *argv[])
{
	int a[] = {1, 2, 4, 6, 9, 11};
	int key = 9, n = 6;
	printf("Complexity:\t%d\nElement %d is at position:\t%d\n", c, key, binarySearch(a, key, n - 1));
	return 0;
}
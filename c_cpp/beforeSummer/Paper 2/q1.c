#include <stdio.h>

int c = 0;

int func(int a[], int n)
{
	int i = 0, j= 0, k = 0, cnt = 0;

	for(i = 0; i < n; i++)
	{
		for(j = i + 1; j < n; j++)
		{
			for(k = j + 1; k < n; k++)
			{
				c++;
				if( ((a[i] + a[j]) > a[k]) && ((a[j] + a[k]) > a[i]) && ((a[i] + a[k]) > a[j]))	cnt++;
			}
		}
	}

	return cnt;
}

int main(int argc, char const *argv[])
{
	// int a[] = {4, 6, 3, 7};
	int a[] = {10, 21, 22, 100, 101, 200, 300};
	printf("%d\n", func(a, 7));
	printf("Complexity:\t%d\n", c);
	return 0;
}
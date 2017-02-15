//sort a binary array

#include <stdio.h>

int complexity = 0;

int sortBinaryAray(int a[], int len)
{
	len--;
	int i = 0, j = len;
	while( (j - i) > 0)
	{
		while(a[i] == 0)
		{
			i++;
			complexity++;
		}
		while(a[j] == 1)
		{
			j--;
			complexity++;
		}
		if(j > i)
		{
			a[i] = 0;
			a[j] = 1;
			i++;
			j--;
			complexity++;
		}
	}
}

int main(int argc, char const *argv[])
{
	int len = 12, i = 0;
	int a[len] = {1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1};
	sortBinaryAray(a, len);

	//print
	for(i = 0; i < len; i++)
	{
		printf("%d\t", a[i]);
	}

	printf("\nComplexity:\t%d\n", complexity);

	return 0;
}
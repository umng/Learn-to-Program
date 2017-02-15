#include <stdio.h>

int complexity = 0;

void printNGE(int a[], int n)
{
	int i = 0, j = 0, flag = 0;
	for(i = 0; i < n; i++)
	{
		for(j = i + 1; j < n; j++)
		{
			if(a[j] > a[i])
			{
				printf("%d\t", a[j]);
				flag = 1;
				break;
			}
			else
			{
				flag = 0;
			}
			complexity++;
		}
		if(flag == 0)
		{
			printf("%d\t", -1);
		}
	}
}

void printArray(int a[], int n)
{
	int i = 0;
	for (i = 0; i < n; ++i)
	{
		printf("%d\t", a[i]);
	}
	printf("\n");
}

int main(int argc, char const *argv[])
{
	int a[] = {21, 13, 4, 14, 5, 9, 2, 0};
	printArray(a, 8);
	printNGE(a, 8);
	printf("\nComplexity:\t%d\n", complexity);

	return 0;
}
#include <stdio.h>

int min = 9999;

int func(int a[], int i, int x)
{
	if(i >= 0)
	{
		int j = 0;
		float k = x / a[i];
		for(j = 0; j <= k; j++)
		{
			int temp = func(a, i + 1, x - (j * a[i]) );
			if(temp <= min)
				min = temp;
		}
		return min;
	}
	else
		return 0;
}

int main(int argc, char const *argv[])
{
	int a[] = {1, 2, 5, 10};
	printf("Minimum Coins:\t%d\n", func(a, 0, 75));
	return 0;
}
#include <stdio.h>

int main(int argc, char const *argv[])
{
	//input
	int n = 5;
	int a[n] = {3, 1, 2, 5, 3};

	int b[n] = {0};
	int i = 0, j = 0, k = 0, c = 0;

	for(i = 0; i < n; i++)
	{
		if( (b[a[i] - 1] += 1) > 1 )	j = a[i];
		if( b[i] < 1 )	k = i+1;
		c++;
	}

	//output
	printf("A = %d\nB = %d\nComplexity: %d\n", j, k, c);
	return 0;
}
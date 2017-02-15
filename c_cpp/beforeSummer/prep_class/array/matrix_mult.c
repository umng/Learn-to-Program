#include <stdio.h>

int main(int argc, char const *argv[])
{
	int a[][2] = { {1, 2}, {3, 4} };
	int b[][2] = { {1, 2}, {3, 4} };
	int c[2][2] = { {0, 0}, {0, 0} };
	int i = 0, j = 0, k = 0;
	for(i = 0; i < 2; i++)
	{
		for(j = 0; j < 2; j++)
		{
			for(k = 0; k < 2; k++)
			{
				c[i][j] += b[k][j] * a[j][k];
			}
		}
	}

	//print results
	for(i = 0; i < 2; i++)
	{
		for(j = 0; j < 2; j++)
		{
			printf("%d\t", c[i][j]);
		}
		printf("\n");
	}


	return 0;
}
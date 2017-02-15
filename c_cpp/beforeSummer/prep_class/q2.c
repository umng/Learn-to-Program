#include <stdio.h>

int main(int argc, char const *argv[])
{

	int A = 300;
	int n = 1;
	int i = 0, j = 0;
	int ans[300][300] = {0};

	while(n <= A*A)
	{
		while(j < A && n <= A*A && ans[i][j] == 0)	ans[i][j++] = n++;
		i++; j--;
		while(i < A && n <= A*A && ans[i][j] == 0)	ans[i++][j] = n++;
		i--; j--;
		while(j >= 0 && n <= A*A && ans[i][j] == 0)	ans[i][j--] = n++;
		i--; j++;
		while(i >= 0 && n <= A*A && ans[i][j] == 0)	ans[i--][j] = n++;
		i++; j++;
	}

	//print results
	for(i = 0; i < A; i++)
	{
		for(j = 0; j < A; j++)
		{
			printf("%d\t", ans[i][j]);
		}
		printf("\n");
	}

	return 0;
}
#include <stdio.h>

int getMax(int x, int y)
{
	return (x > y) ? x : y;
}

int main(int argc, char const *argv[])
{
	int a[] = {2, 2, 4, 6, 2, 3}, n = 6, maxHeight = 6;
	int i = 0, j = 0, cnt = 0, maxArea = 0, c = 0;

	for(i = 0; i <= maxHeight; i++)
	{
		cnt = 0;
		for(j = 0; j <= n; j++)
		{
			if(a[j] >= i)	
			{
				cnt++;
				maxArea = getMax(maxArea, i * cnt);
			}
			else
			{
				maxArea = getMax(maxArea, i * cnt);
				cnt = 0;
			}
			c++;
		}
	}

	printf("Maximum Area:\t%d\nComplexity:%d\n", maxArea, c);



	return 0;
}
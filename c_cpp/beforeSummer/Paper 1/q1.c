#include <stdio.h>

int c =0;

int getMin(int x, int y)
{
	return (x < y) ? x : y;
}

void cutSticks(int n, int l[])
{
	int i = 0, min = 9999, cnt = 0, flag = 0;

	// get minimum
	for(i = 0; i < n; i++)
	{
		min = getMin(l[i], min);
	}

	while(flag == 0)
	{
		flag = 1;
		cnt  = 0;
		for(i = 0; i < n; i++)
		{
			c++;
			if(l[i] > 0)
			{
				cnt++;
				l[i] -= min;
				if(l[i] > 0)	flag = 0;
			}
		}
		printf("%d\n", cnt);
	}
}

int main(int argc, char const *argv[])
{
	int l[] = {4, 5, 10, 8, 11};
	int n = 5;

	cutSticks(n, l);
	printf("\n\nComplexity:\t%d\n", c);

	return 0;
}
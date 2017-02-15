#include <stdio.h>

int flag = 0, c = 0;

int getSum(char x, char y)
{
	int a = 0, b = 0;
	if(x == '0')	a = 0;
	else	a = 1;

	if(y == '0') b = 0;
	else	b = 1;

	int z = 0;
	if(a == 0)
	{
		if(b == 0)
		{
			if(flag == 1)
			{
				flag = 0;
				return 1;
			}
			else
			{
				flag = 0;
				return 0;
			}
		}
		else
		{
			if(flag == 1)
			{
				flag = 1;
				return 0;
			}
			else
			{
				flag = 0;
				return 1;
			}
		}
	}
	else
	{
		if(b == 0)
		{
			if(flag == 1)
			{
				flag = 1;
				return 0;
			}
			else
			{
				flag = 0;
				return 1;
			}
		}
		else
		{
			if(flag == 1)
			{
				flag = 1;
				return 1;
			}
			else
			{
				flag = 1;
				return 0;
			}
		}
	}
}

void getBinarySum(char a[], char b[], int n, int m)
{
	int i = n, j = m, p = 0; char k;
	while(i > 0 && j > 0)
	{
		// printf("%d\n", flag);
		p = getSum(a[i - 1], b[j - 1]);
		if(p == 0)	k = '0';
		else	k = '1';

		// printf("%c\t%c:\t%c\n", a[i - 1], b[j - 1] , k);
		a[i - 1] = k;

		i--;
		j--;
		c++;
	}
	while(i > 0)
	{
		p = getSum(a[i - 1], '0');
		if(p == 0)	k = '0';
		else	k = '1';

		// printf("%c\t%c:\t%c\n", a[i - 1], '0' , k);
		a[i - 1] = k;
		i--;
		c++;
	}
	while(i > 0)
	{
		p = getSum(b[j - 1], '0');
		if(p == 0)	k = '0';
		else	k = '1';
		c++;

		// printf("%c\t%c:\t%c\n", b[j - 1], '0' , k);
		a[i - 1] = k;
		i--;
	}
}

int main(int argc, char const *argv[])
{
	char a[] = "1";
	char b[] = "111";
	int n = 3, m = 1;
	if(n > m)
	{
		getBinarySum(a, b, n, m);
		if(flag == 1)
			printf("Sum is:\t1%s\n", a);
		else
			printf("Sum is:\t%s\n", a);
	}
	else
	{
		getBinarySum(b, a, m, n);
		if(flag == 1)
			printf("Sum is:\t1%s\n", b);
		else
			printf("Sum is:\t%s\n", b);
	}

	printf("Complexity:\t%d\n", c);
	
	return 0;
}
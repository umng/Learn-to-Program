#include <stdio.h>

int F[100] = {0};
int c = 0, s = 0;

int fib(int n)
{
	c++;
	if(n <= 1)
		return n;
	else
	{
		if(F[n] != 0)
		{
			return F[n];
		}
		F[n] = fib(n - 1) + fib(n - 2);
		s++;
		return F[n];
	}
}

int main(int argc, char const *argv[])
{
	int n = 20;
	printf("%dth Fibonacci Series Number:\t%d\n", n, fib(n));
	printf("Time Complexity:\t%d\nSpace Complexity:\t%d\n\n", c, s);
	return 0;
}
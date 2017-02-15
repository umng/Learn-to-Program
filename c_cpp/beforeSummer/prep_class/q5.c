#include <stdio.h>

int fib(int n)
{
	if(n == 0)	return 0;
	if(n == 1)	return 1;
	return fib(n - 1) + fib(n - 2);
}

int main(int argc, char const *argv[])
{
	printf("Fib:\t%d\n", fib(8));
	return 0;
}
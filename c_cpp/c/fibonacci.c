#include<stdio.h>

void fib(int x, int y, int z)
{
	if(y<z)
	{
		printf("%d\t", y);
		fib(y,x+y,z);
	}
}

int main()
{
	fib(0, 1, 15);
}
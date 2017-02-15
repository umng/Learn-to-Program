#include <stdio.h>

char s[10] = "000000000";
int i = 0;

int binary(int n)
{
	if(n == 1)	printf("1");
	else
	{
		binary(n/2);
		if(n%2 == 0)	printf("0");
		else	printf("1");
	}
}

int main(int argc, char const *argv[])
{
	binary(1);
	// printf("%s\n", s);
	return 0;
}
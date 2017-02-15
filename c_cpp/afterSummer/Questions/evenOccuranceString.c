//find which occur even times in a string

#include <stdio.h>

int evenOccuranceString(char* s, int len)
{
	int a[26] = {0};
	int i = 0;

	for(i = 0; i < len; i++)
	{
		a[s[i] - 97]++;
	}

	for(i = 0; i < 26; i++)
	{
		if( (a[i]%2) == 0 && a[i] != 0)
		{
			printf("%c\t", i + 97);
		}
	}
	printf("\n");
}

int main(int argc, char const *argv[])
{
	evenOccuranceString("abcefa", 6);
	evenOccuranceString("aaa", 3);
	evenOccuranceString("abcdefghijklmnopqrstuvwxyz", 26);
	evenOccuranceString("cc", 2);


	return 0;
}
#include <stdio.h>
#include <string.h>

char x[10][5] = {"", "", "ABC ", "DEF ", "GHI ", "JKL ", "MNO ", "PQRS", "TUV ", "WXYZ"};

int getInt(char c)
{
	return ((int) c) - 48;
}

void func(char a[])
{
	int l = strlen(a);
	int i = 0, j = 0;;
	int flag = 0;

	for(j = 0; j < 4; j++)
	{
		for(j = 0; j < 4; j++)
		{
			i = 0;
			while(i < l)
			{
				int v = getInt(a[i]);
				if(v == 7 || v == 9)
				{
					if(j < 4)	printf("%c", x[v][j]);
				}
				else
				{
					if(j < 3)	printf("%c", x[v][j]);
				}

				i++;
			}
			printf("\n");
		}
	}
}

int main(int argc, char const *argv[])
{
	char a[] = "893548";
	func(a);

	return 0;
}
#include <stdio.h>
#include <string.h>

void getstringPermutation(char s[], char g[], int sn, int gn)
{
	if(strlen(g) == gn)
	{
		printf("%s\n", g);
	}
	else
	{
		sn++;
		int i = 0;
		for(i = sn; sn <= gn; sn++)
		{
			char temp[1] = {s[sn]};
			getstringPermutation(s, strcat(g, temp), sn, gn);
		}
		// getstringPermutation(s, g, sn, gn);
	}
}


int main(int argc, char const *argv[])
{
	char s[] = "lpu";
	char g[3] = "";
	getstringPermutation(s, g, -1, 3);

	return 0;
}
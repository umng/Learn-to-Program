#include<stdio.h>

int main()
{
	char s[] = "umang and nikunj";
	int i = 0;
	for(i = 0; s[i] != '\0'; i++)
	{
		if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
		{
			s[i] = ' ';
		}
	}

	printf("%s\n", s);
}
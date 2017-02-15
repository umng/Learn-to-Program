#include<stdio.h>
#include<string.h>

char temp;

void reverse(int x, int y, char z[])
{
	if(y>x)
	{
		temp = z[x];
		z[x] = z[y];
		z[y] = temp;
		reverse(x+1,y-1,z);
	}
}

int main()
{
	char a[] = "aba";
	char t[strlen(a)];
	strcpy(t,a);
	reverse(0, strlen(a)-1, a);
	printf("%s\n", a);
	if(t == a)
	{
		printf("String is Palindrome.\n");
	}
	else
	{
		printf("String is NOT Palindrome.\n");
	}
}
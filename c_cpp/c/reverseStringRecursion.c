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
	char a[] = "umang patelklllllllllllllllllllllllllllllghghfghfdrtyhfhjhghj"; 	
	
	reverse(0, strlen(a)-1, a);
	
	printf("%s\n", a);
}
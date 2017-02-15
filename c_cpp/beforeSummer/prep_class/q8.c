#include <stdio.h>

//find non-repeatable element
int getXOR(int a[], int i, int n)
{
	if(i == n) return a[i];
	return a[i] ^ getXOR(a, i + 1, n);
}

int main(int argc, char const *argv[])
{
	int a[] = {3, 1, 2, 3, 10, 2, 1};
	printf("non-repeatable Element:\t%d\n", getXOR(a, 0, 7));
	return 0;
}
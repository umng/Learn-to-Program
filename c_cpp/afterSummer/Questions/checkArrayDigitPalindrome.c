//check if digit Array is Palindrome

#include <stdio.h>

bool checkArrayDigitPalindrome(int a[], int len)
{
	int i = 0;
	for (i = 0; i < (len); i++)
	{
		printf("%d\t", a[i]);
		// if(a[i] != a[len - i])
		// 	return false;
	}
	return true;
}

int main(int argc, char const *argv[])
{
	int len = 5;
	int a[len] = {1, 3, 2, 3, 1};

	printf("\n\n\n\n%d\n", checkArrayDigitPalindrome(a, len));

	return 0;
}
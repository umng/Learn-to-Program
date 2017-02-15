#include<stdio.h>

int getMax(int x, int y)
{
	return ( (x>=y)? x : y );
}

void maximumContigiousArray(int* A, int* DP)
{
	int i = 0;
	DP[0] = A[0];
	for( i = 1;  i<7; i++)
	{
		DP[i] = getMax( DP[i-1] + A[i], A[i]);
	}
}


void show(int *A)
{
	printf("\nElements:\t");
	int i;
	for(i = 0; i<7; i++)
	{
		printf("%d\t", A[i]);
	}
}

int getMaxArray(int *A)
{
	int i, temp, x;
	for(i = 0; i<7; i++)
	{
		temp = getMax(A[i], A[i+1]);
		if(temp >= x)	x = temp;
	}
	return x;
}

int main()
{
	int A[7] = {1, 7, 2, -2, -9, 4, 5};
	int DP[7];
	maximumContigiousArray(A,DP);
	show(A);
	show(DP);
	
	printf("\nMaximum :\t%d\t", getMaxArray(DP));
}
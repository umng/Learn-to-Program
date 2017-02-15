#include <stdio.h>

int c = 0;

void selectionSort(int a[], int n)
{
	int i = 0, j = 0, min = 0, temp = 0;
	bool flag;
	for(i = 0; i < n; i++)
	{
		min = i;
		flag = false;
		for(j = i + 1; j < n; j++)
		{
			if(a[j] < a[min])	
			{
				min = j;
				flag = true;
			}
			c++;
		}
		if(flag == true)
		{
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}

}

int main(int argc, char const *argv[])
{
	int a[] = {5, 2, 10, 4, 1, 3};
	int i = 0, n = 6;

	selectionSort(a, n);  // sort the array

	printf("Complexity:\t%d\nSorted array:\t", c);  // print sorted array
	for(i = 0; i < n; i++)
	printf("%d\t",a[i]);
	return 0;
}
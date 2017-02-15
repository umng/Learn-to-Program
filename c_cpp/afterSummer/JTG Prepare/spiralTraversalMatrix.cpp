#include <iostream>

using namespace std;

void spiralTraverseMatrix(int a[][4], int n)
{
	int i1=0, i2=n, j1=0, j2=n, i, j;

	while(i1<i2 || j1<j2)
	{
		i=i1;	j=j1;
		while(i!=i2)
		{
			cout<<a[j][i]<<"\t";
			i++;
		}
		i--;j++;
		while(j!=j2)
		{
			cout<<a[j][i]<<"\t";
			j++;
		}
		j--;i--;
		while(i!=i1-1)
		{
			cout<<a[j][i]<<"\t";
			i--;
		}
		i++;j--;
		while(j!=j1)
		{
			cout<<a[j][i]<<"\t";
			j--;
		}
		i1++;i2--;
		j1++;j2--;
	}
}

void printMatrix(int a[][4], int n)
{
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cout<<a[i][j]<<"\t";
		}
		cout<<endl;
	}
}

int main(int argc, char const *argv[])
{
	int a[][4] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
	// printMatrix(a, 4);
	spiralTraverseMatrix(a, 4);

	return 0;
}
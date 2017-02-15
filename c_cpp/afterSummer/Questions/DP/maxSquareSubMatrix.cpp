#include <iostream>

using namespace std;

int getMin(int a, int b, int c)
{
	if(a<b && a<c)
		return a;
	else if(b<a && b<c)
		return b;
	else
		return c;
}

int getMaxSquareSubMatrix(int a[][5], int x, int y)
{
	int maxSquare = 0;
	for (int i = 1; i < y; i++)
	{
		for (int j = 1; j < x; j++)
		{
			if(a[i][j] == 1 && a[i-1][j] > 0 && a[i][j-1] > 0 && a[i-1][j-1] > 0)
			{
				a[i][j] = 1 + getMin(a[i-1][j-1], a[i-1][j], a[i][j-1]);
			}
			(a[i][j] > maxSquare) ? maxSquare = a[i][j] : maxSquare = maxSquare;
		}
	}
	return maxSquare;
}

int main(int argc, char const *argv[])
{
	int matrix[][5] = { {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0} };

	cout<<"Maximum Square Matrix:\t"<<getMaxSquareSubMatrix(matrix, 6, 5)<<endl;

	return 0;
}
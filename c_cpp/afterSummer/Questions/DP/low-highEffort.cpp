#include <iostream>

using namespace std;

int getMax(int a, int b)
{
	if(a > b)
		return a;
	else
		return b;
}

int maxTasks(int L[], int H[], int n)
{
	int prev = 0, max = 0, temp = 0;

	for (int i = 0; i < n; i++)
	{
		temp = max;
		max += getMax(L[i], H[i] - prev);
		prev = max - temp;
	}
	return max;
}

int main(int argc, char const *argv[])
{
	int L[] = {1, 5, 4, 5, 3};
	int H[] = {3, 20, 8, 12, 6};

	cout<<maxTasks(L, H, sizeof(L)/sizeof(L[0]))<<endl;

	return 0;
}
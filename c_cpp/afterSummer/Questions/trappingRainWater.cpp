#include <iostream>

using namespace std;

int findWater(int arr[], int n)
{
	int left[n];
	int right[n];
	int water = 0;

	left[0] =arr[0];
	for (int i = 1; i < n; i++)
		left[i] = max(left[i-1], arr[i]);

	right[n-1] = arr[n-1];
	for (int i = n-2; i >= 0; i--)
		right[i] = max(right[i+1], arr[i]);

	for (int i = 0; i < n; i++)
	{
		water += min(left[i], right[i]) - arr[i];
		cout<<water<<endl;
	}

	return water;
}

int getMaxTrapRainWater(int a[], int n)
{
	int MAX = 0, curr = 0, prev_curr = 0;

	for (int i = 0; i < n; i++)
	{
		for (int j = i+1; j < n; j++)
		{
			if(a[j] < a[i])
			{
				curr = prev_curr + ( a[i] - a[j] );
				prev_curr = curr;
			}
			if(a[j] >= a[i])
			{
				MAX = max(MAX, curr);
				cout<<a[i]<<"\t"<<a[j]<<"\t->"<<curr<<endl;
				curr = 0;
				prev_curr = 0;
				i = j;
				j++;
			}
		}
	}
	return MAX;
}

int main(int argc, char const *argv[])
{
	int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	cout<<getMaxTrapRainWater(a, 12)<<endl;

	return 0;
}
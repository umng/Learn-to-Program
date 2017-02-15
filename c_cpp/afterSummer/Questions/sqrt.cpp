#include <iostream>

using namespace std;

int sqrt(int n)
{
	int i = 0, j = n/2, mid = 0, ans = -1;

	while(i <= j)
	{
		mid = (i + j) / 2;
		if(mid*mid == n)
		{
			return mid;
		}
		else if(mid*mid < n)	i = mid + 1;
		else	j = mid - 1;
	}
	return -1;
}

int main(int argc, char const *argv[])
{
	cout<<sqrt(25)<<endl;

	return 0;
}
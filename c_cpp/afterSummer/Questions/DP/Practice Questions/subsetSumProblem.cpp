#include <iostream>

using namespace std;

int subsetSum(int a[], int s, int n)
{
	int maxWays = 0;

	int dp[s+1][n] = {0};

	for (int i = 0; i <= s; i++)
	{
		cout<<i<<"->\t";
		for (int j = 0; j < n; j++)
		{
			if(i == 0)
				dp[i][j] = 1;
			else if(j == 0)
				dp[i][j] = 0;
			else if(i >= a[j])
				dp[i][j] = dp[i - a[j]][j-1] + dp[i][j-1];
			else
				dp[i][j] = dp[i][j-1];
			cout<<dp[i][j]<<"\t";
		}
		maxWays = max(maxWays, dp[s][n-1]);
		cout<<endl;
	}
	return maxWays;
}

int main(int argc, char const *argv[])
{
	int a[] = {0,3,34,4,12,5,2};
	int s = 9	;

	cout<<"No. of ways:\t"<<subsetSum(a, s, sizeof(a)/sizeof(a[0]))<<endl;
	return 0;
}
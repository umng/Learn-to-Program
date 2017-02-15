#include <iostream>

using namespace std;

string knapsack(int val[], int wt[], int W, int n)
{
	int dp[W+1][n+1] = {0};

	for (int i = 0; i <= W; i++)
	{
		// cout<<i<<"\t";
		for (int j = 0; j <= n; j++)
		{
			if(i==0 || j==0)
				dp[i][j] = 0;
			else if(i >= wt[j])
				dp[i][j] = max(dp[i - wt[j]][j-1] + val[j], dp[i][j-1]);
			else
				dp[i][j] = dp[i][j-1];
			// cout<<dp[i][j]<<"\t";
		}
		// cout<<endl;
	}

	int i = W;
	int j = n;
	string s = "";
	while(i!=0)
	{
		if(dp[i][j] == dp[i][j-1])
			j--;
		else
		{
			cout<<j<<"\t";
			i = i-wt[j];
		}
	}
	return s;
}

int main(int argc, char const *argv[])
{
	int val[] = {0,80,100,120,130};
	int wt[] = {0,10,20,30,50};
	int W = 60;

	cout<<knapsack(val,wt,W, sizeof(wt)/sizeof(wt[0]))<<endl;

	return 0;
}
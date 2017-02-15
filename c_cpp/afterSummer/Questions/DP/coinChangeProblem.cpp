#include <iostream>

using namespace std;

int dp[10] = {-1};

int getCoins(int c[], int n, int v)
{
	if(v == 0){
		return 0;
	}
	int maxCoins = 0;
	for (int i = 1; i < n; i++)
	{
		if(dp[i - 1] == -1)
		{
			dp[i - 1] = getCoins(coins, n, v - coins[i-1]);
		}
	}
}

int main(int argc, char const *argv[])
{
	int coins[] = {9,6,5,1};
	cout<<getCoins(coins, 4, 11)<<endl;

	return 0;
}
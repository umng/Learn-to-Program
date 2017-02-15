#include <iostream>

using namespace std;

string longestCommonSubSequence(string str1, string str2, int m, int n)
{
	int dp[m+1][n+1] = {0};

	for (int i = 0; i < m+1; i++)
	{
		for (int j = 0; j < n+1; j++)
		{
			if (i == 0 || j == 0)
				dp[i][j] = 0;
			else if(str1[i-1] == str2[j-1])
				dp[i][j] = dp[i-1][j-1] + 1;
			else
				dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
			// cout<<dp[i][j]<<"\t";
		}
		// cout<<endl;
	}

	int i=m, j=n;
	int len = dp[i][j];
	char subSequence[len + 1];
	subSequence[len--]='\0';

	while(i>=0 && j>=0)
	{
		if(str1[i-1] == str2[j-1])
		{
			subSequence[len--] = str1[i-1];
			i--;
			j--;
		}
		else if (dp[i-1][j] > dp[i][j-1])
			i--;
		else
			j--;
	}

	return subSequence;
}

int main(int argc, char const *argv[])
{
	string s1 = "GXTXAYB";
	string s2 = "AGGTAB";

	cout<<longestCommonSubSequence(s1, s2, s1.length(), s2.length())<<endl;

	return 0;
}
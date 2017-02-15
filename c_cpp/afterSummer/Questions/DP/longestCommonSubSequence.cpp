#include <iostream>

using namespace std;

int getMax(int a, int b)
{
	if(a > b)
		return a;
	else
		return b;
}

int longestCommonSubSequence(string s1, string s2, int n1, int n2)
{
	int dp1[n1] = {0}, dp2[n1] = {0};

	if(n1== 0 || n2==0)
		return 0;

	for (int i = 0; i < n2; i++)
	{
		for (int j = 0; j < n1; j++)
		{
			if(s1[i] == s2[j])
				dp2[j] = 1 + dp1[j-1];
			else
				dp2[j] = getMax(dp2[j-1], dp1[j]);

			for (int k = 0; k < n1; k++)
			{
				dp1[k] = dp2[k];
			}
		}
	}

	return dp1[n1-1];
}

int main(int argc, char const *argv[])
{
	string s1 = "AGGTAB";
	string s2 = "GXTXAYB";

	cout<<longestCommonSubSequence(s1, s2, s1.length(), s2.length())<<endl;

	return 0;
}
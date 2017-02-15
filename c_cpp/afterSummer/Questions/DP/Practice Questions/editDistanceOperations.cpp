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

int editDistanceOperations(string str1, string str2, int m, int n)
{
	int dp[m+1][n+1] = {0};
	int min = 0;

	for (int i = 0; i <= m; i++)
	{
		cout<<i<<"->\t";
		for (int j = 0; j <= n; j++)
		{
			if(i == 0)
				dp[i][j] = j;
			else if(j == 0)
				dp[i][j] = i;
			else if(str1[i-1] == str2[j-1])
				dp[i][j] = dp[i-1][j-1];
			else
			{
				min = getMin(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
				dp[i][j] = 1 + min; 

				if(dp[i][j] != dp[i-1][j-1])
				{
					// cout<<i<<"\t--\t"<<j<<"\t";
					// if(min == dp[i][j-1])
					// 	cout<<"Remove"<<endl;
					// else if(min == dp[i-1][j])
					// 	cout<<"Add"<<endl;
					// else
					// 	cout<<"Replace"<<endl;
				}
			}
			cout<<dp[i][j]<<"\t";
		}
		cout<<endl;
	}

	int i=m;
	int j=n;

	while(i != 0)
	{
		while (j != 0)
		{
			if(dp[i][j] == dp[i-1][j-1])
			{
				i--;
				j--;
			}
			else
			{
				cout<<"Replacelace-\t"<<str1[j]<<"\twith-\t"<<str2[i]<<endl;
				i--;
				j--;
			}
		}
	}
	return dp[m][n];
}

int main(int argc, char const *argv[])
{
	string str1 = "SUNDAY";
	string str2 = "SATURDAY";

	cout<<editDistanceOperations(str1, str2, str1.length(), str2.length())<<endl;

	return 0;
}
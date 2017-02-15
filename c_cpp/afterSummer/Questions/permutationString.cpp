#include <iostream>

using namespace std;

void permutationString(string &s, int i, int n)
{
	if(i == n)
		cout<<s<<endl;
	else
		for (int j = i; j<n; j++)
		{
			swap(s[i], s[j]);
			permutationString(s, i+1, n);
			swap(s[i], s[j]);
		}
}

int main(int argc, char const *argv[])
{
	string s = "abc";

	permutationString(s, 0, s.length());

	return 0;
}

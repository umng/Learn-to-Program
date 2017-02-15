#include <iostream>

using namespace std;

bool checkPangrams(string s)
{
	// int a[26] = {0};
	// for (int i = 0; i < s.length(); i++)
	// 	a[s[i] - 'a'] += 1;
	// for (int i = 0; i < 26; i++)
	// 	if(a[i] == 0)
	// 		return false;
	// return true;

	int hash = 0;
	for (int i = 0; i < s[i] != '\0'; i++)
		if (s[i] >= 'a' && s[i] <= 'z')
			hash = hash | (1 << (s[i] - 'a'));
	if(hash == 2^26 - 1)
		return true;
	return false;
}

int main(int argc, char const *argv[])
{
	string s = "the quick brown fox jumps over the lazy dog";

	(checkPangrams(s)) ? cout<<"True"<<endl : cout<<"False"<<endl;
	return 0;
}
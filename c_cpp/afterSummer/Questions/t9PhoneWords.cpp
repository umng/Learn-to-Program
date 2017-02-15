#include <iostream>

using namespace std;

string s[] = {" ", " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

void t9PhoneWords(string str, int i, int n, string t)
{
	if(i == n)
	{
		cout<<t<<endl;
		return;
	}
	for(int j = 0; j < s[str[i] - '0'].length(); j++)
		t9PhoneWords(str, i+1, n, t + s[str[i] - '0'][j]);
}

void printT9PhoneWords(string str)
{
	t9PhoneWords(str, 0, str.length(), "");
}

int main(int argc, char const *argv[])
{
	string str = "22";

	printT9PhoneWords(str);

	return 0;
}

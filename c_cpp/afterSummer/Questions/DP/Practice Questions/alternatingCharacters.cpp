#include <iostream>

using namespace std;

int minDeleteChars(string s)
{
	char temp;
	int min = 0;
	for (int i = 0; i < s[i] != '\0'; i++)
	{
		if(s[i] == temp)
			min++;
		temp = s[i];
	}
	return min;
}

int main(int argc, char const *argv[])
{
	string s1 = "AAAA";
	string s2 = "BBBBB";
	string s3 = "ABABABAB";
	string s4 = "BABABA";
	string s5 = "AAABBB";

	cout<<minDeleteChars(s1)<<endl;
	cout<<minDeleteChars(s2)<<endl;
	cout<<minDeleteChars(s3)<<endl;
	cout<<minDeleteChars(s4)<<endl;
	cout<<minDeleteChars(s5)<<endl;

	return 0;
}
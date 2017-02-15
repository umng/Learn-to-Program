#include <iostream>

using namespace std;

int absolute(int a)
{
	if(a < 0)
		return (-a);
	return a;
}

int checkFunnyString(string s)
{
	for (int i = 1; i < s[i] != '\0'; i++)
		if(absolute(s[i] - s[i-1]) != absolute(s[s.length()-i] - s[s.length()-i-1]))
			return false;
	return true;
}

int main(int argc, char const *argv[])
{
	string s = "acxz";
	(checkFunnyString(s)) ? cout<<"True - Funny"<<endl : cout<<"False - Not Funny"<<endl;

	return 0;
}
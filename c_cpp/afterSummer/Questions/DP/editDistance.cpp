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

int editDistance(string str1, string str2, int m, int n)
{
	if(m == 0)
		return n;
	if(n == 0)
		return m;
	if(str1[m-1] == str2[n-1])
		return editDistance(str1, str2, m-1 , n-1);

	// cout<< 1 + getMin(editDistance(str1, str2, m , n-1), editDistance(str1, str2, m-1 , n), editDistance(str1, str2, m-1 , n-1))<<"\t";

	return 1 + getMin(editDistance(str1, str2, m , n-1), editDistance(str1, str2, m-1 , n), editDistance(str1, str2, m-1 , n-1));
}

int main(int argc, char const *argv[])
{
	string str1 = "SUNDAY";
	string str2 = "SATURDAY";

	cout<<editDistance(str1, str2, str1.length(), str2.length())<<endl;

	return 0;
}
#include <iostream>

using namespace std;

int getMax(int a, int b)
{
	if(a > b)
		return a;
	else
		return b;
}

int checkInterleavedString(string A, string B, string C)
{
	int n = C.length();
	int max1 = 0, max2 = 0, i = 0, j = 0, k = 0, temp = 0, t1 = 0, t2 = 0, t3 = 0;

	while(i != n)
	{
		if(j == A.length() && k == B.length())
			return false;

		max1 = 0, max2 = 0, temp = i, t2 = j;
		while(A[j] == C[temp])
		{
			max1++; temp++; j++;
		}
		t1 = temp; temp = i; t3 = k;
		while(B[k] == C[temp])
		{
			max2++; temp++; k++;
		}

		if(max1 > max2)
		{
			i = t1;
			if(k == t3)
				k = t3 + 1;
			else
				k = t3;
		}
		else
		{
			i = temp;
			if(j == t2)
				j = t2 + 1;
			else
				j = t3;
		}
	}

	return true;
}

int main(int argc, char const *argv[])
{
	string s1 = "ABC";
	string s2 = "DEF";
	string s3 = "ADBECF";

	cout<<checkInterleavedString(s1, s2, s3)<<endl;

	return 0;
}
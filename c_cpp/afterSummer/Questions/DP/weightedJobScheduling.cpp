#include <iostream>
#include <vector>

using namespace std;

struct Job
{
	int start;
	int finish;
	int profit;
};

bool jobComparator(Job s1, Job s2)
{
	return (s1.finish < s2.finish);
}

int weightedJobScheduling(Job s[], int n)
{
	sort(s.begin(), s.end(), jobComparator);
	cout<<s[3].profit;
}

int main(int argc, char const *argv[])
{
	Job s[4];

	for (int i = 0; i < 4; i++)
	{
		cout<<endl<<"Job "<<i+1<<endl<<"start:\t";
		cin>>s[i].start;
		cout<<"finish:\t";
		cin>>s[i].finish;
		cout<<"profit:\t";
		cin>>s[i].profit;
	}



	return 0;
}
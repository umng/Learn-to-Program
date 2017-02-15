#include<iostream>
 using namespace std;
 
 void combinations(string a,string b,int i,int k)
{
	if(i==k){
		cout<<b<<endl;
	}
	else
	{
		combinations(a,b + a[i],i+1,k);
		combinations(a,b,i+1,k);
	}
}
  int main()
  {
  	string s="ABC";
  	
  	combinations(s,"",0,3);
  }

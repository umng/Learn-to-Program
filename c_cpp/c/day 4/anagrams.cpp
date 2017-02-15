#include<iostream>
#include<string>
 using namespace std;
 void perm(string a,string b,int N)
 {
 	if(N==0)
 	{
 	cout<<b<<endl;
 	}
 	else{
 		string c;
 		for(int k=0;k<a.length();k++)
 		{
		    c=a;
 		 	c.erase(c.begin()+k,c.begin() +k+1);
 			perm(c,b + a[k],N-1);
 		}
 		
 	}
 }
 int main()
 {
 	string s="ABC";
 	
    perm(s,"",3);
 }

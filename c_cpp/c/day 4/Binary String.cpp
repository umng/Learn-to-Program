#include<iostream>
using namespace std;

string que[100];
int front=-1,rear=-1;

void ins(string x){
	if(rear==100)
	cout<<"Overflow";
	else{
		if(front==-1 && rear==-1)
		{
		rear++;
		que[rear]=x;
		front=rear;
	}
	else{
		rear++;
		que[rear]=x;
	}
	}
}

string del()
{
	if(front==-1 || front ==rear+1)
	cout<<"Underflow";
	else{
		string x=que[front];
		front++;
		return x;
	}
}

int main()
{
	string s;
	int n;
cout<<"Enter value";
cin>>n;
ins("1");
for(int i=1;i<=n;i++)
{
	s=del();
	cout<<s<<endl;
	ins(s+"0");
	ins(s+"1");
}

}

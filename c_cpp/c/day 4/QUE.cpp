#include<iostream>
using namespace std;

int que[100];
int front=-1,rear=-1;

void ins(int x){
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

int del()
{
	if(front==-1 || front ==rear+1)
	cout<<"Underflow";
	else{
		int x=que[front];
		front++;
		return x;
	}
}

int main()
{
	ins(10);
	ins(20);
	ins(20);
	ins(30);
	ins(40);


for(int i=0;i<5;i++)
cout<<del();
}

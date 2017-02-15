#include<iostream>
using namespace std;

int que[10];
int front=-1,rear=-1;
int count=0;
void ins(int x){
	if(count==10)
	cout<<"Overflow";
	else{
		if(front==-1 && rear==-1)
		{
		rear++;
		que[rear]=x;
		front=rear;
	}
	else{
		rear=(rear+1)%10;
		que[rear]=x;
	}
	count++;
	}
}

int del()
{
	if(count==0)
	cout<<"Underflow";
	else{
		int x=que[front];
		front=(front+1)%10;
		count--;
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
	del();
	del();
	ins(10);
	ins(20);
	ins(20);
	ins(30);
	ins(40);


for(int i=0;i<10;i++)
cout<<del()<<endl;
}

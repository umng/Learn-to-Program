#include<iostream>
using namespace std;

int stack[100];
int top=-1;

void push(int x)
{
	if(top==100){
	cout<<"Overflow" ;}

	else{
		top++;
		stack[top]=x;
	}
}
int peek()
{
	return stack[top];
}

int pop()
{
	if(top==-1) cout<<"Underflow";
	else {
		int x=stack[top];
		top--;
		return x;
	}
}
void sortedIns(int y)
{
	if(stack[top]<=y || top==-1)
	{
		push(y);
	}
	else{
		int x=pop();
		sortedIns(y);
		push(x);
	}
}
void sort()
{
	if(top==-1) return;
	
	int y=pop();
	sort();
	sortedIns(y);
}
int main()
{
	push(5);
	push(1);
	push(4);
	push(11);
	
	sort();
	for(int i=0;i<4;i++){
		cout<<pop()<<endl;
	}

}

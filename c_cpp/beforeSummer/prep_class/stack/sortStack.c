#include <stdio.h>

struct stack
{
	int a[20];
	int top;
};

struct stack s;

bool isEmpty()
{
	if(s.top == -1)	return true;
	else return false;
}

bool isFull()
{
	if(s.top == 19)	return true;
	else	return false;
}

bool push(int x)
{
	if(!isFull())	s.a[++s.top] = x;
	else	return false;
}

bool pop()
{
	if(!isEmpty())	s.top--;
	else	return false;
}

int peek()
{
	if(!isEmpty())	return s.a[s.top];
	else	return false;
}

int main(int argc, char const *argv[])
{
	s.top = -1;

	push(5);
	push(4);
	push(2);
	push(3);
	push(6);

	printf("%d\n", dequeue());


	return 0;
}
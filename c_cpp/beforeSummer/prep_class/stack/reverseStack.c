#include <stdio.h>

struct stack
{
	int a[20];
	int top;
};

struct stack s1, s2;

bool isEmptyS1()
{
	if(s1.top == -1)	return true;
	else return false;
}

bool isFullS1()
{
	if(s1.top == 19)	return true;
	else	return false;
}

bool pushS1(int x)
{
	if(!isFullS1())	s1.a[++s1.top] = x;
	else	return false;
}

bool popS1()
{
	if(!isEmptyS1())	s1.top--;
	else	return false;
}

int peekS1()
{
	if(!isEmptyS1())	return s1.a[s1.top];
	else	return false;
}

bool isEmptyS2()
{
	if(s2.top == -1)	return true;
	else return false;
}

bool isFullS2()
{
	if(s2.top == 19)	return true;
	else	return false;
}

bool pushS2(int x)
{
	if(!isFullS2())	s2.a[++s2.top] = x;
	else	return false;
}

bool popS2()
{
	if(!isEmptyS2())	s2.top--;
	else	return false;
}

int peekS2()
{
	if(!isEmptyS2())	return s2.a[s2.top];
	else	return false;
}

bool reverse()
{
	if(!isEmptyS1())
	{
		int y = peekS1();
		popS1();
		reverse();
		pushS2(y);
	}
	else
	{
		while(!isEmptyS2())
		{
			int y = peekS2();
			popS2();
			pushS2(y);
		}
	}

}

int main(int argc, char const *argv[])
{
	s1.top = -1;
	s2.top = -1;

	pushS1(5);
	pushS1(4);
	pushS1(3);
	printf("%d\n", peekS1());
	reverse();
	printf("%d\n", peekS2());

	return 0;
}
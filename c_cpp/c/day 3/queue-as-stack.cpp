#include <iostream>
#include<stdio.h>
using namespace std;

struct stack
{
    int a[100];
    int top;
} s;

void init_stack()
{
    s.top = -1;
}

void pause()
{
    char ch;
    cin >> ch;
}

void push(int item)
{
    if (s.top == 99)
    {
        printf("Overflow");
        pause();
    }
    else 
    {
        s.top++;
        s.a[s.top] = item;
    }
}

int peek()
{
    if (s.top == -1)
    {
        printf("Underflow");
        pause();        
    }
    else 
    {
        return s.a[s.top];
    }
}

void pop()
{
    if (s.top == -1)
    {
        printf("Underflow");
        pause();
    }
    else
    {
        s.top--;
    }
}

int queue_pop()
{
    if (s.top == -1)
    {
        printf("Underflow");
    } else
    {
        int temp = peek();
        pop();
        if (s.top == -1)
        {
            return temp;
        }
        else
        {
            int bottom = queue_pop();
            push(temp);
            return bottom;
        }
    }
}

int main()
{
    init_stack();
    push(1);
    push(2);
    push(3);
    
    cout << queue_pop() << endl;
    cout << queue_pop() << endl;
}

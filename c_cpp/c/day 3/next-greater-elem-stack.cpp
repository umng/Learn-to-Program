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


void nge(int a[], int n)
{
    int indx = 1;
    push(a[0]);
    
    while (indx < n)
    {
        while (s.top != -1 && peek() <= a[indx])
        {
            printf("%d -> %d\n", peek(), a[indx]);
            pop();
        }
        push(a[indx]);
        indx++;
    }
}

int main()
{
    int arr[] = {13, 7, 6, 12, 15};
    int n = sizeof(arr)/sizeof(arr[0]);
    init_stack();
    nge(arr, n);
}

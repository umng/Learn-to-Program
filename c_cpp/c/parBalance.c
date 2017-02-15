#include<stdio.h>
#include<stdlib.h>

struct node 
{
	char data;
	struct node *next;
};

struct node* head;
struct node* top;

struct node* newNode(int data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> data = data;
	newN -> next = NULL;
	return newN;
}

void pushNode(int data)
{
	if(head == NULL)
	{
		head = newNode(data);
		top = head;
	}
	else
	{
		struct node* trav = head;
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav  -> next = newNode(data);	
	}
	// printf("Node Added Succesfully\n");
}

void popNode()
{
	if(head == NULL)
	{
		printf("Stack is NULL\n");
	}
	else
	{
		struct node* trav = head;
		struct node* temp = head;
		int i = 0;
		while(trav -> next != NULL)
		{
			temp = trav;
			trav = trav -> next;
		}
		if(temp -> next == NULL)
		{
			head = NULL;
		}
		temp -> next = NULL;
		free(trav);
		// printf("POPPED Succesfully\n");
	}
}

void printNode()
{
	struct node* trav = head;
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		printf("%d\n", trav -> data);
		while(trav -> next != NULL)
		{
			trav = trav -> next;
			printf("%c\n", trav -> data);
			
		}
	}
}


int main()
{
	head = NULL;

	// printNode();

	char a[6] = "{{}}}";
	int i;
	for(i=0;i<5;i++)
	{
		if(a[i] == '{')
		{
			pushNode(a[i]);
		}
	}
	for(i=0;i<5;i++)
	{
		if(a[i] == '}')
		{
			popNode();
		}
	}
	if(head == NULL)
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}
}
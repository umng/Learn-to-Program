#include<stdio.h>
#include<stdlib.h>

void pushMinNode(int data);

struct node 
{
	int data;
	struct node *next;
};

struct node* head;
struct node* top;

struct node* headMin;
struct node* topMin;

struct node* newNode(int data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> data = data;
	newN -> next = NULL;
	return newN;
}

void pushNode(int data)
{
	if(top == NULL)
	{
		head = newNode(data);
		top = head;
	}
	else
	{
		struct node* trav = top;
		trav  -> next = newNode(data);
		top = trav -> next;
	}
	
	// if(topMin -> data > data)
	// {
	// 	pushMinNode(data);
	// }
	printf("Node Added Succesfully\n");
}

void popNode()
{
	if(head == NULL)
	{
		printf("List is NULL\n");
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
			head =NULL;
		}
		temp -> next = NULL;
		free(trav);
		printf("POPPED Succesfully\n");
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
		printf("%d\t", trav -> data);
		while(trav -> next != NULL)
		{
			trav = trav -> next;
			printf("%d\t", trav -> data);
			
		}
	}
}

void pushMinNode(int data)
{
	if(topMin == NULL)
	{
		headMin = newNode(data);
		topMin = headMin;
	}
	else
	{
		struct node* trav = topMin;
		trav  -> next = newNode(data);
		topMin = trav -> next;
	}
	printf("Node Added Succesfully\n");
}

void getMin()
{
	printf("Minimum is : %d\n", topMin -> data);
}


int main()
{
	head = NULL;
	headMin = NULL;
	topMin = NULL;

	printNode();

	pushNode(10);
	pushNode(20);
	pushNode(30);
	pushNode(40);
	popNode();
	// popNode();
	// popNode();
	// popNode();
	printNode();
	
}
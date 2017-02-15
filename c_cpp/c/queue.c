#include<stdio.h>
#include<stdlib.h>

struct node 
{
	int data;
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

void enque(int data)
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
	printf("Node Added Succesfully\n");
}

void deque()
{
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		struct node* trav = head;
		struct node* temp = head;
		temp = trav;
		trav = trav -> next;
		head = trav;
		free(temp);
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
		printf("%d\n", trav -> data);
		while(trav -> next != NULL)
		{
			trav = trav -> next;
			printf("%d\n", trav -> data);
			
		}
	}
}


int main()
{
	head = NULL;

	printNode();

	enque(10);
	enque(20);
	enque(30);
	enque(40);
	deque();
	deque();
	enque(50);
	deque();
	enque(60);
	printNode();
	
}
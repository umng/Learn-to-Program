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

void enqueFront(int data)
{
	if(head == NULL)
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
	printf("Node Added Succesfully\n");
}

void enqueLast(int data)
{
	if(top == NULL)
	{
		top = newNode(data);
		head = top;
	}
	else
	{
		struct node* trav = head;
		trav  = newNode(data);
		trav -> next = head;
		head = trav;
	}
	printf("Node Added Succesfully\n");
}

void dequeLast()
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

void dequeFirst()
{
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		struct node* trav = head;
		struct node* temp = temp;
		while(trav -> next != NULL)
		{
			temp = trav;
			trav = trav -> next;
		}
		// temp = trav;
		// trav = trav -> next;
		top = temp;
		top -> next = NULL;
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
		printf("%d\n", trav -> data);
		while(trav -> next != NULL)
		{
			trav = trav -> next;
			printf("%d\n", trav -> data);
			
		}
	}
}

void isEmpty()
{
	if(head == NULL)
	{
		printf("Queue is EMPTY.\n");
	}
	else
	{
		printf("Queue is NOT Empty.\n");
	}
}

void getFront()
{
	if(head == NULL)
	{
		printf("Queue is EMPTY.\n");
	}
	else
	{
		printf("Front is : %d.\n", top -> data);
	}
}

void getLast()
{
	if(head == NULL)
	{
		printf("Queue is EMPTY.\n");
	}
	else
	{
		printf("Last is : %d.\n", head -> data);
	}
}

int main()
{
	head = NULL;

	printNode();

	enqueFront(10);
	enqueFront(20);
	enqueFront(30);
	enqueFront(40);
	dequeLast();
	dequeLast();
	enqueFront(50);
	dequeLast();
	enqueFront(60);
	enqueLast(80);
	// dequeFirst();
	// dequeFirst();
	// dequeLast();
	// dequeLast();
	isEmpty();
	getFront();
	getLast();
	printNode();
	
	
}
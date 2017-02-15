#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *next;
};

struct node* head;

struct node* newNode(int data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> data = data;
	newN -> next = NULL;
	return newN;
}

void insertNode(int data)
{
	if(head == NULL)
	{
		head = newNode(data);
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
}

void printNode()
{
	struct node* trav = head;
	while(trav -> next != NULL)
	{
		printf("%d\n", trav -> data);
		trav = trav -> next;
	}
}

void reverseNode()
{
	struct node* trav = head;
	struct node* temp = head;
}

int main(int argc, char const *argv[])
{
	// struct node* head = NULL;	//NOTE-1
	head = NULL;
	insertNode(10);
	insertNode(20);
	insertNode(30);
	insertNode(40);
	insertNode(50);
	insertNode(60);
	printNode();
	
	
	
	
	return 0;
}
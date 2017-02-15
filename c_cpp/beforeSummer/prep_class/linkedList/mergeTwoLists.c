#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node *next;
};

struct Node *headA, *headB, *trav, *temp;

struct Node *newNode(int data)
{
	struct Node *node = (struct Node*) malloc(sizeof(struct Node));
	node -> data = data;
	node -> next = NULL;
	return node;
}

void insertNodeA(int data)
{
	trav = headA;
	if(headA == NULL)
		headA = newNode(data);
	else
	{
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav -> next = newNode(data);
	}
}

void insertNodeB(int data)
{
	trav = headB;
	if(headB == NULL)
		headB = newNode(data);
	else
	{
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav -> next = newNode(data);
	}
}

void printListA()
{
	trav = headA;
	if(headA == NULL)
		printf("List is Empty.\n");
	else
	{
		printf("\nListA:\t");
		while(trav != NULL)
		{
			printf("%d\t", trav -> data);
			trav = trav -> next;
		}
		printf("\n\n");
	}
}

void printListB()
{
	trav = headB;
	if(headB == NULL)
		printf("List is Empty.\n");
	else
	{
		printf("\nListB:\t");
		while(trav != NULL)
		{
			printf("%d\t", trav -> data);
			trav = trav -> next;
		}
		printf("\n\n");
	}
}

struct Node* mergeLists();

int main(int argc, char const *argv[])
{
	insertNodeA(3);
	insertNodeA(5);
	insertNodeA(8);
	insertNodeA(6);
	insertNodeA(3);
	printListA();

	insertNodeB(2);
	insertNodeB(1);
	insertNodeB(7);
	insertNodeB(6);
	printListB();

	return 0;
}
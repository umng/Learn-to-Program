#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int x;
	int y;
	struct Node *next;
};

struct Node *head, *trav, *temp, *t;

struct Node *newNode(int x, int y)
{
	struct Node *node = (struct Node*) malloc(sizeof(struct Node));
	node -> x = x;
	node -> y = y;
	node -> next = NULL;
	return node;
}

void insertNode(int x, int y)
{
	trav = head;
	if(head == NULL)
		head = newNode(x, y);
	else
	{
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav -> next = newNode(x, y);
	}
}

void printList()
{
	trav = head;
	if(head == NULL)
		printf("List is Empty.\n");
	else
	{
		printf("\nList:\n");
		while(trav != NULL)
		{
			printf("%d\t%d\n", trav -> x, trav -> y);
			trav = trav -> next;
		}
		printf("\n\n");
	}
}

int removeNode(struct Node *head)
{
	temp = head;
	trav = temp -> next;
	while(trav -> next != NULL)
	{
		printf("%d\t%d\n", trav -> x, trav -> y);
		if ( ( (temp -> y == trav -> y) && (trav -> y == (trav -> next) -> y) ) ||
			 ( (temp -> x == trav -> x) && (trav -> x == (trav -> next) -> x) ) )
		{
			printf("%d\t%d\n", trav -> x, trav -> y);
			temp -> next = trav -> next;
			t = trav;
			trav = trav -> next;
			free(t);
		}
		else
		{
			temp = trav;
			trav = trav -> next;
		}
	}
}

int main(int argc, char const *argv[])
{
	insertNode(0, 0);
	insertNode(1, 0);
	insertNode(1, -1);
	insertNode(0, -1);
	insertNode(0, -2);
	insertNode(0, -3);
	insertNode(0, -4);
	insertNode(1, -4);
	insertNode(2, -4);
	insertNode(3, -4);
	insertNode(4, -4);
	insertNode(5, -4);

	removeNode(head);

	printList();
	return 0;
}
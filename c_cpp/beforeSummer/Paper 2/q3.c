#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node *next;
};

struct Node *head;

struct Node *newNode(int data)
{
	struct Node *node = (struct Node *) malloc(sizeof(struct Node));
	node -> data = data;
	node -> next = NULL;
	return node;
}

void insertNode(int data)
{
	struct Node *trav = head;
	while(trav -> next != NULL)
	{
		trav = trav -> next;
	}
	struct Node *node = newNode(data);
	trav -> next = node;
}

void printNode(struct Node *head)
{
	struct Node *trav = head;
	while(trav != NULL)
	{
		printf("%d\n", trav -> data);
		trav = trav -> next;
	}
}

struct Node *removeNodes(struct Node *head, int x)
{
	struct Node *temp = head;
	struct Node *trav = temp -> next, *h;

	if(head == NULL)
		return head;
	else 
	{
		while(trav != NULL)
		{	
			if(trav -> data > x)
			{
				h = trav;
				trav = trav -> next;
				temp -> next = trav;
				free(h);
			}
			else
			{
				h = temp;
				temp = trav;
				trav = trav -> next;
			}
		}

		if(temp -> data > x)
		{
			h -> next = NULL;
			free(temp);
		}
	}

	return head;
}

int main(int argc, char const *argv[])
{
	head = newNode(5);
	insertNode(2);
	insertNode(9);
	insertNode(8);
	insertNode(1);
	insertNode(6);
	insertNode(7);

	removeNodes(head, 5);

	printNode(head);

	return 0;
}
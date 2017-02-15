#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node *next;
};

struct Node *head, *trav, *temp;

struct Node *newNode(int data)
{
	struct Node *node = (struct Node*) malloc(sizeof(struct Node));
	node -> data = data;
	node -> next = NULL;
	return node;
}

void insertNode(int data)
{
	trav = head;
	if(head == NULL)
		head = newNode(data);
	else
	{
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav -> next = newNode(data);
	}
}

void insertNode(int data, int after)
{
	trav = head;
	temp = trav	-> next;
	if(head == NULL)
		printf("List is NULL.\n");
	else
	{
		while(trav != NULL && trav -> data != after)
		{
			trav = trav	-> next;
			temp = temp -> next;
		}
		struct Node *a = newNode(data);
		trav -> next = a;
		a -> next = temp;
	}
}

void removeNode(int data)
{
	temp = head;
	trav =	temp -> next;
	if(head == NULL)
		printf("List is Empty.\n");
	else
	{
		if(temp -> data == data)
		{
			head = trav;
			printf("Node: %d\tREMOVED\n", trav -> data);
			free(temp);
			return;
		}
		while(trav != NULL)
		{
			if(trav -> data == data)
			{
				temp -> next = trav -> next;
				printf("Node: %d\tREMOVED\n", trav -> data);
				free(trav);
				break;
			}
			temp = trav;
			trav = trav -> next;
		}
	}
}

void printList()
{
	trav = head;
	if(head == NULL)
		printf("List is Empty.\n");
	else
	{
		printf("\nList:\t");
		while(trav != NULL)
		{
			printf("%d\t", trav -> data);
			trav = trav -> next;
		}
		printf("\n\n");
	}
}

int main(int argc, char const *argv[])
{
	insertNode(3);
	insertNode(5);
	insertNode(8);
	insertNode(6);
	removeNode(3);
	insertNode(3);
	insertNode(4,3);

	printList();
	return 0;
}
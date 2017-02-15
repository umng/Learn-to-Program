#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node *next;
};

struct Node *head, *trav, *temp, *temp2;

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

void reverseList()
{
	if(head == NULL)
		printf("List is Empty.\n");
	else if(head -> next == NULL)
		return;
	else if( (head -> next) -> next == NULL)
		{
			trav = head;
			head  = head -> next;
			head -> next = trav;
			trav -> next = NULL;
		}
	else
	{
		temp = head;
		trav= temp -> next;
		temp2 = trav -> next;
		head -> next =NULL;
		// trav -> next = temp;
		temp = trav;
		trav= trav -> next;
		temp2 = temp2 -> next;
			while(temp2 != NULL)
			{
				// trav -> next = temp;
				// temp = trav;
				// trav = temp2;
				// temp2 = temp2 -> next;
				temp -> next = head;
				head = temp;
				temp = trav;
				trav = trav -> next;
				temp2 = temp2 -> next;
			}
			temp -> next = head;
			head = temp;
			trav -> next = head;
			head = trav;
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
	insertNode(9);
	// insertNode(1);

	reverseList();
	printList();
	return 0;
}
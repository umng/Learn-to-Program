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

// int countNode()
// {
// 	int x;
// 	trav = head;
// 	if(head == NULL)
// 		x = 0;
// 	else
// 	{
// 		while(trav != NULL)
// 		{
// 			trav = trav -> next;
// 			x++;
// 		}
// 	}
// 	return x;
// }

int countNode(struct Node *t)
{
	if(t == NULL)
		return 0;
	else
		return 1 + countNode(t -> next);
}


int main(int argc, char const *argv[])
{
	insertNode(3);
	insertNode(5);
	insertNode(8);
	insertNode(6);
	insertNode(9);
	insertNode(1);
	printf("No. of Nodes:\t%d\n", countNode(head));

	return 0;
}
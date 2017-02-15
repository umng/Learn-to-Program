#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node *next;
};

struct Node *head, *trav, *temp, *temp2, *t;

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

int countNode(struct Node *t)
{
	if(t == NULL)
		return 0;
	else
		return 1 + countNode(t -> next);
}

void reverseList(int x)
{
	x -= 2;
	temp = head;
		trav= temp -> next;
		temp2 = trav -> next;

		head -> next =NULL;

		temp = trav;
		trav= trav -> next;
		temp2 = temp2 -> next;
		while(x >= 0)
		{
			temp -> next = head;
			head = temp;
			temp = trav;
			trav = trav -> next;
			temp2 = temp2 -> next;
			
			x--;
		}
		t = temp;
		// head = temp;
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

bool compare(struct Node *a, struct Node *b)
{
	while(a != NULL && b!= NULL)
	{
		// printf("%d\t%d\n", a -> data, b -> data);
		if(a -> data != b -> data)
			return false;
		
		a = a -> next;
		b = b -> next;
	}
	return true;
}


int main(int argc, char const *argv[])
{
	insertNode(3);
	insertNode(5);
	insertNode(8);
	insertNode(6);
	insertNode(8);
	insertNode(5);
	insertNode(3);
	int a = countNode(head);
	if(a%2 == 0)
	{
		reverseList(a/2);
		a = compare(head, t);
	}
	else
	{
		reverseList( (a/2) + 1 );
		head = head -> next;
		a = compare(head, t);
	}

	if(a == 0)
		printf("Not Palindrome.\n");
	else
		printf("Palindrome.\n");

	// printf("No. of Nodes:\t%d\n", countNode(head));

	return 0;
}
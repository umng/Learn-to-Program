#include<stdio.h>
#include<stdlib.h>

struct node 
{
	struct node *prev;
	int data;
	struct node *next;
};

struct node* head;

struct node* newNode(int data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> prev = NULL;
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
		struct node* temp = head;
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		temp = newNode(data);
		trav  -> next = temp;
		temp -> prev = trav;
		trav = temp;
	}
	printf("Node Added Succesfully\n");
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

void deleteNode(int data)
{
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		struct node* trav = head;
		struct node* temp = head;
		int i = 0;

		if(trav -> next == NULL)
		{
			if(trav -> data == data)
				{
					trav = trav -> next;
					trav -> prev = NULL;
					free(trav);
					i = 2;
				}
		}
		else
		{
			while(trav -> next != NULL)
			{
				if(trav -> data == data)
				{
					if(trav -> prev == NULL)
					{
						head = head -> next;
					}
					else
					{
						temp -> next = trav -> next;
						(trav -> next) -> prev = temp;
						free(trav);
						i = 1;
						break;
					}
				}
				temp = trav;
				trav = trav -> next;
			}
		}

		if(i == 0)
		{
			printf("Node with value : %d\t NOT FOUND\n", data );
		}
		else if(i == 1)
		{
			printf("Node with value : %d\t DELETED Succesfully\n", data );
		}
		else if(i == 2)
		{
			printf("Node with value : %d\t DELETED Succesfully. LIST is NULL now.\n", data );
		}
	}
}

int main(int argc, char const *argv[])
{
	head = NULL;
	insertNode(10);
	insertNode(20);
	insertNode(30);
	insertNode(40);
	insertNode(50);
	int x = 1, temp = 0;
	printf("***\tLinked List\t***\n");
	while(1 == 1)
	{
		printf("--------------------------------\nEnter your choice.\n1)Print List\n2)Insert Node\n3)Delete Node\n0)Exit\nYour choice: ");
		scanf("%d", &x);
		if(x == 0)
		{
			printf("Thank You!\n");
			return 0;
		}
		else if (x == 1)
		{
			printNode();
		}
		else if (x == 2)
		{
			printf("Enter value for new node: ");
			scanf("%d", &temp);
			insertNode(temp);
		}
		else if (x == 3)
		{
			printf("Enter value of node: ");
			scanf("%d", &temp);
			deleteNode(temp);
		}
		else
		{
			printf("INVALID choice... Try Again...\n");
		}
	}
	
	
	return 0;
}
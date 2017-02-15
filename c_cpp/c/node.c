#include<stdio.h>
#include<stdlib.h>

//NOTE-1 : this is a second way of creating a pointer and pass value by reference to insertNode function

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

// void insertNode(struct node** head) 	//NOTE-1
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
					temp -> next = trav -> next;
					free(trav);
					i = 1;
					break;
					//write delete code
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

void reverseList()
{
	struct node* trav = head;
	struct node* temp = head;
	struct node* temp2 = head;
	
	if(trav == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		temp2 = trav -> next;
		trav -> next = NULL;
		
		while(trav != NULL)
		{
			temp =trav;
			trav = temp2;
			if(temp2 != NULL)
			{
				temp2 = temp2 -> next;
			}
			
			if(trav != NULL)
			{
				trav -> next = temp;
			}
		}
		head = temp;
		printf("List is REVERSED Succesfully\n");
	}
}

void lengthList()
{
	struct node* trav = head;
	int length = 1;
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		while(trav -> next != NULL)
		{
			trav = trav -> next;
			length++;
		}
	}
	if(length%2 == 0)
	{
		printf("Length of List is EVEN");
	}
	else
	{
		printf("Length of List is ODD");
	}
	printf("\n");
}

void printReverseList()
{
	reverseList();
	printNode();
	reverseList();
}

void deleteSpecificNode(int data)
{
	if(head == NULL)
	{
		printf("List is NULL\n");
	}
	else
	{
		struct node* trav = head;
		struct node* temp = head;
		int i = 0, j = 0;

		while(trav -> next != NULL)
			{
				if(j == data)
				{
					temp -> next = trav -> next;
					free(trav);
					break;
				}
				
				temp = trav;
				trav = trav -> next;
				
				j++;
			}

		printf("Node at position : %d\t DELETED Succesfully\n", data );
	}
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
	int x = 1, temp = 0;
	printf("***\tLinked List\t***\n");
	while(1 == 1)
	{
		printf("--------------------------------\nEnter your choice.\n1)Print List\n2)Insert Node\n3)Delete Node\n4)Reverse List\n5)Length (ODD | EVEN)\n6)Print List in Reverse Order\n7)Delete specific node\n0)Exit\nYour choice: ");
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
		else if (x == 4)
		{
			reverseList();
		}
		else if (x == 5)
		{
			lengthList();
		}
		else if (x == 6)
		{
			printReverseList();
		}
		else if (x == 7)
		{
			printf("Enter value of node: ");
			scanf("%d", &temp);
			deleteSpecificNode(temp);
		}
		else
		{
			printf("INVALID choice... Try Again...\n");
		}
	}
	
	
	return 0;
}
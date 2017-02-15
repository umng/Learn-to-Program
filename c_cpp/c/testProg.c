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
	struct node* newN = (struct node*) malloc(sizeof(struct node));
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
		trav -> next = newNode(data);
	}
}

void removeNode(int data)
{
	struct node* trav = head;
	struct node* pTrav = trav;
	while(trav != NULL)
	{
		if(trav -> data == data)
		{
			pTrav -> next = trav -> next;
			free(trav);
			printf("The node with data : %d Removed.\n", data);
			return;
		}
		else
		{
			pTrav = trav;
			trav = trav -> next;
		}
	}
}

void reverseNode()
{
	struct node* trav = head;
	struct node* pTrav = trav;
	trav = pTrav -> next;
	struct node* nTrav = trav -> next;

	pTrav -> next = NULL;

	while(pTrav -> next != NULL)
	{
		trav -> next = pTrav;
		pTrav = trav;
		trav = nTrav;
		nTrav = nTrav -> next;
	}
	// head = trav;
	// head -> next = pTrav;
}

void printNode()
{
	struct node* trav = head;
	while(trav != NULL)
	{
		printf("%d\n", trav -> data);
		trav = trav -> next;
	}
}

int ans = 0, c = 0, flag = 0;
int GetNode(struct node* head,int positionFromTail)
{
  // This is a "method-only" submission.
  // You only need to complete this method.
    if(head==NULL) return 0;
    if(flag==0) {
        c=GetNode(head->next,positionFromTail);
        if(flag == 1){
            return ans;
        }
        if(c==positionFromTail) {
            ans=head->data;
            flag=1;
            return ans;
        }
        printf("%d\t",c);
        c++;
       return c;
    }
    return ans;
}

int main(int argc, char const *argv[])
{
	insertNode(1);
	// insertNode(1);
	// insertNode(4);
	// insertNode(6);
	// insertNode(8);
	// insertNode(9);
	// insertNode(0);
	printNode();
	// removeNode(30);
	// reverseNode();
	// printNode();
	printf("\n%d",GetNode(head,0));

	return 0;
}

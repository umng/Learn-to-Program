#include<stdio.h>
#include<stdlib.h>

struct treeNode
{
	int d;
	struct treeNode* l;
	struct treeNode* r;
};

///////////////////		Stack	///////////////////////

struct node 
{
	struct treeNode* data;
	struct node *next;
};

struct node* head;
struct node* top;

struct node* headMin;
struct node* topMin;

struct node* newNodeStack(struct treeNode* data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> data = data;
	newN -> next = NULL;
	return newN;
}

void pushNode(struct treeNode* data)
{
	if(top == NULL)
	{
		head = newNodeStack(data);
		top = head;
	}
	else
	{
		struct node* trav = top;
		trav  -> next = newNodeStack(data);
		top = trav -> next;
	}
	
	// if(topMin -> data > data)
	// {
	// 	pushMinNode(data);
	// }
	// printf("Node Added Succesfully\n");
}

void popNode()
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
		while(trav -> next != NULL)
		{
			temp = trav;
			trav = trav -> next;
		}
		if(temp -> next == NULL)
		{
			head =NULL;
		}
		temp -> next = NULL;
		printf("%d\t", trav -> data -> d);
		free(trav);
		// printf("POPPED Succesfully\n");
	}
}


///////////////////////////////////////////////////////

struct treeNode* root;

struct treeNode* newNode(int data)
{
	struct treeNode *newN = (struct treeNode*) malloc(sizeof(struct treeNode));
	newN -> d = data;
	newN -> l = NULL;
	newN -> r = NULL;
	return newN;
}

void preTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		printf("%d\t", root -> d);
		preTrav(root -> l);
		preTrav(root -> r);
	}
}

void postTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		postTrav(root -> l);
		postTrav(root -> r);
		printf("%d\t", root -> d);
	}
}

void inTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		inTrav(root -> l);
		printf("%d\t", root -> d);
		inTrav(root -> r);
	}
}

struct treeNode* insertNode(struct treeNode* root, int data)
{
	if(root == NULL)
	{
		root = newNode(data);
	}
	else
	{
		if(data < (root -> d))
		{
			root -> l = insertNode(root -> l, data);
		}
		else
		{
			root -> r = insertNode(root -> r, data);
		}
	}
	return root;
}

int c;

int count(struct treeNode* root)
{
	if(root != NULL)
	{
		c++;
		count(root -> l);
		count(root -> r);
	}
	return c;
}

void InOrderUsingStack(struct treeNode* root)
{
	if(root != NULL)
	{
		InOrderUsingStack(root -> r);
		pushNode(root);
		InOrderUsingStack(root -> l);
	}
}

void PreOrderUsingStack(struct treeNode* root)
{
	if(root != NULL)
	{
		PreOrderUsingStack(root -> r);
		PreOrderUsingStack(root -> l);
		pushNode(root);
	}
}

void PreOrderUsingStackWithoutRecursion(struct treeNode* root)
{
	if(root != NULL)
	{
		PreOrderUsingStack(root -> r);
		PreOrderUsingStack(root -> l);
		pushNode(root);
	}
}

int main()
{
	root = NULL;

	// root = newNode(1);
	// root -> l = newNode(2);
	// root -> r = newNode(3);

	// root -> l -> l = newNode(4);
	// root -> l -> r = newNode(5);

	// root -> r -> r = newNode(6);

	// insertNode(root, 7);
	// insertNode(root, 8);
	// insertNode(root, 9);
	// insertNode(root, 10);
	// insertNode(root, 11);
	// insertNode(root, 12);
	// insertNode(root, 13);
	// insertNode(root, 14);

	root = insertNode(root, 5);
	insertNode(root, 3);
	insertNode(root, 7);
	insertNode(root, 1);
	insertNode(root, 4);
	insertNode(root, 6);
	insertNode(root, 9);

	printf("\nPre-Order Trversal:\t");
	preTrav(root);
	printf("\nPost-Order Trversal:\t");
	postTrav(root);
	printf("\nIn-Order Trversal:\t");
	inTrav(root);

	count(root);
	printf("\nCount:\t%d\n", c);

	printf("\nPre-Order Trversal using STACK:\t");
	PreOrderUsingStack(root);
	while(head != NULL)
	{
		popNode();
	}

	printf("\nIn-Order Trversal using STACK:\t");
	InOrderUsingStack(root);
	while(head != NULL)
	{
		popNode();
	}
	
}
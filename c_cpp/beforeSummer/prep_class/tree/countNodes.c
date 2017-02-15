#include <stdio.h>
#include <stdlib.h>

struct tree
{
	int data;
	struct tree *left;
	struct tree *right;
};

struct tree *root, *trav;

struct tree *newNode(int data)
{
	struct tree *node = (struct tree *) malloc(sizeof(struct tree));
	node -> data = data;
	node -> left = NULL;	
	node -> right = NULL;
	return node;
}

void insertNode(struct tree* head, int data)
{
	if(root == NULL)
	{
		root = newNode(data);
		return;
	}
	if(head -> data > data)
	{
		if(head -> left == NULL)
			head -> left = newNode(data);
		else
			insertNode(head -> left, data);
	}
	else
	{
		if(head -> right == NULL)
			head -> right = newNode(data);
		else
			insertNode(head -> right, data);
	}
}

int countNode(struct tree *head)
{
	if(head != NULL)
	{
		return 1 + countNode(head -> left) + countNode(head -> right);
	}
}



int main(int argc, char const *argv[])
{
	insertNode(root, 12);
	insertNode(root, 10);
	insertNode(root, 30);
	insertNode(root, 25);
	insertNode(root, 40);
	insertNode(root, 45);
	insertNode(root, 41);
	insertNode(root, 49);
	insertNode(root, 8);

	printf("No. of Nodes:\t%d\n", countNode(root));
	return 0;
}
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
	else
	{

		if(head -> left == NULL)
		{
			printf("lN   %d\n\n", data);
			head -> left = newNode(data);
		}
		else if(head -> right == NULL)
		{
			printf("rN   %d\n\n", data);
			head -> right = newNode(data);
		}
		else if(head -> left != NULL)
		{
			printf("l   %d\n", head -> left -> data);
			insertNode(head -> left, data);
		}
		else if(head -> right != NULL)
		{
			printf("r   %d\n", data);
			insertNode(head -> right, data);
		}
	}
}

void printTree(struct tree *head)
{
	if(head != NULL)
	{
		printf("%d\t", head -> data);
		printTree(head -> left);
		printTree(head -> right);
	}
}



int main(int argc, char const *argv[])
{
	insertNode(root, 100);
	insertNode(root, 50);
	insertNode(root, 200);
	insertNode(root, 40);
	insertNode(root, 90);
	insertNode(root, 150);
	insertNode(root, 300);
	// insertNode(root, 49);
	// insertNode(root, 8);

	printTree(root);
	return 0;
}
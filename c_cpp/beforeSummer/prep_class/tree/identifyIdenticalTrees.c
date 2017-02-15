#include <stdio.h>
#include <stdlib.h>

struct tree
{
	int data;
	struct tree *left;
	struct tree *right;
};

struct tree *root, *root2, *trav;
int flag = 0;

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
	if(head == NULL)
	{
		if(head == root)
			root = newNode(data);
		else
			root2 = newNode(data);
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

void identifyIdentical(struct tree *head, struct tree *head2)
{

	if(head == NULL && head2 != NULL )
	{
		flag = 1;
		return;
	}
	else if(head != NULL && head2 == NULL )
	{
		flag = 1;
		return;
	}
	if(head != NULL)
	{
		if(head -> data != head2 -> data)
		{
			flag = 1;
			return;
		}
		identifyIdentical(head -> left, head2 -> left);
		identifyIdentical(head -> right, head2 -> right);
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

	insertNode(root2, 12);
	insertNode(root2, 10);
	insertNode(root2, 30);
	insertNode(root2, 25);
	insertNode(root2, 40);
	insertNode(root2, 45);
	insertNode(root2, 41);
	insertNode(root2, 49);
	insertNode(root2, 8);

	// printTree(root);
	// printf("\n\n\n\n");
	// printTree(root2);

	identifyIdentical(root, root2);
	if(flag == 0)
		printf("Identical.\n");
	else
		printf("Not Identical.\n");

	return 0;
}

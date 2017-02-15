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

int getMax(int x, int y)
{
	return (x > y) ? x : y;
}

int heightTree(struct tree *head)
{
	if(head != NULL)
	{
		return 1 + getMax( heightTree(head -> left), heightTree(head -> right) );
	}
	else
		return 0;
}

int getDiameter(struct tree *head)
{
	if(head == NULL)
	{
		return 0;
	}
	else
	{
		return getMax( getMax(getDiameter(head -> left), getDiameter(head -> right) ), 1 + getDiameter(head -> left) + getDiameter(head -> right) );
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

	printf("Diameter:\t%d\n", getDiameter(root));
	return 0;
}
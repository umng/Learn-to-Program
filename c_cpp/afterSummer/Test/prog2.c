#include <stdio.h>
#include <stdlib.h>

struct node{
	int data;
	node *left;
	node *right;
};

struct node* root;

struct node *newNode(int data)
{
	struct node* nNode = (struct node*) malloc(sizeof(struct node*));
	nNode -> data = data;
	nNode -> left = NULL;
	nNode -> right = NULL;

	return nNode;
}

int getMax(int a, int b, int c)
{
	if(a > b && a > c)
	{
		return a;
	}
	else if(b > a && b > c)
	{
		return b;
	}
	else if(c > a && c > b)
	{
		return c;
	}
}

int getDiameter(struct node* root)
{
	if(root == NULL)
	{
		return 1;
	}
	else
	{
		return getMax(getDiameter(root -> left), getDiameter(root -> right), 1 + getDiameter(root -> left) + getDiameter(root -> right));
	}
}

int main(int argc, char const *argv[])
{
	// printf("%d\n", (newNode(5) -> data));
	root = newNode(0);
	root -> left = newNode(2);
	root -> left -> left = newNode(4);
	root -> left -> right = newNode(5);
	root -> left -> left -> left = newNode(7);
	root -> left -> left -> left -> left = newNode(0);

	printf("%d\n", getDiameter(root));

	return 0;
}
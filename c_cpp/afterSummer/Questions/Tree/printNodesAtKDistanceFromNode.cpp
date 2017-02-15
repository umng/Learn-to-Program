#include <iostream>
#include <vector>

using namespace std;

typedef struct node
{
	int info;
	node *left;
	node *right;
}tnode;

tnode *createNode(int info, tnode* left = NULL, tnode* right = NULL)
{
	tnode* node = new tnode();
	node -> info = info;
	node -> left = NULL;
	node -> right = NULL;
	return node;
}

int KDown(tnode* root, int k)
{
	if(!root)
		return 0;
	if(k == 0)
	{
		cout<<root -> info<<", ";
		return 0;
	}
	k--;
	KDown(root -> left, k);
	KDown(root -> right, k);
	return 0;
}

int printNodesAtKDistanceFromNode(tnode *root, int target, int k)
{
	if(!root)
		return -1;
	if(root -> info == target)
	{
		KDown(root, k);
		return 0;
	}

	int m = printNodesAtKDistanceFromNode(root -> left, target, k);
	if(m > -1)
	{
		if(m+1 == k)
			cout<<root -> info<<", ";
		else
		{
			KDown(root -> right, k-m-1);
			return m+1;
		}
	}
	else
	{
		int n = printNodesAtKDistanceFromNode(root -> right, target, k);
		if(n+1 == k)
			cout<<root -> info<<", ";
		else
			KDown(root -> left, k-m-1);
		return n+1;
	}
}

int main(int argc, char const *argv[])
{
	tnode *root;
	root = createNode(20);
	root -> left = createNode(8);
	root -> right = createNode(22);

	root -> left -> left = createNode(4);
	root -> left -> right = createNode(12);

	root -> left -> right -> left = createNode(10);
	root -> left -> right -> right = createNode(14);

	printNodesAtKDistanceFromNode(root,8,2);

	return 0;
}

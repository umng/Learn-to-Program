#include <iostream>
#include <vector>

using namespace std;

typedef struct node
{
	int info;
	node *left;
	node *right;
}tnode;

// typedef struct node tnode;

tnode *createNode(int info, tnode* left = NULL, tnode* right = NULL)
{
	tnode* node = new tnode();
	node -> info = info;
	node -> left = NULL;
	node -> right = NULL;
	return node;
}

void preOrder(tnode* root)
{
	if(!root)
		return;
	cout<< root -> info<<"\t";
	preOrder(root -> left);
	preOrder(root -> right);
}

void inOrder(tnode* root)
{
	if(!root)
		return;
	inOrder(root -> left);
	cout<< root -> info<<"\t";
	inOrder(root -> right);
}

void postOrder(tnode* root)
{
	if(!root)
		return;
	postOrder(root -> left);
	postOrder(root -> right);
	cout<< root -> info<<"\t";
}

void rootToLeafPaths(tnode *root, std::vector<int> v)
{
	v.push_back(root -> info);
	if(root -> left == NULL && root -> right == NULL)
	{
		int n = v.size();
		for(int i = 0; i < n; i++)
		{
			cout<<"\t->\t"<<v.at(i);
		}
		cout<<endl;
		v.pop_back();
		return;
	}
	if(root -> left != NULL)
		rootToLeafPaths(root -> left, v);
	if(root -> right != NULL)
		rootToLeafPaths(root -> right, v);
}

int main(int argc, char const *argv[])
{
	tnode *root;
	root = createNode(10);
	root -> left = createNode(8);
	root -> right = createNode(2);

	root -> left -> left = createNode(3);
	root -> left -> right = createNode(5);

	root -> right -> left = createNode(2);

	// cout<<endl<<"PreOrder:\t";
	// preOrder(root);
	// cout<<endl<<"InOrder:\t";
	// inOrder(root);
	// cout<<endl<<"PostOrder:\t";
	// postOrder(root);
	// cout<<endl;

	std::vector<int> v;
	rootToLeafPaths(root, v);

	return 0;
}

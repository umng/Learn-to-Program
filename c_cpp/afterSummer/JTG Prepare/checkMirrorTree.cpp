#include <iostream>
#include <queue>
#include <stack>

using namespace std;

typedef struct node{
	int data;
	node *left;
	node *right;
}tNode;

tNode* createNode(int data)
{
	tNode* n = new tNode();
	n->data=data;
	n->left=NULL;
	n->right=NULL;
	return n;
}

bool checkMirror(tNode *root1, tNode *root2)
{
	if(!root1 && !root2)
		return true;
	else if( (!root1 && root2) || (root1 && !root2) )
		return false;

	if(root1->data == root2->data)
		return (checkMirror(root1->left, root2->right) && checkMirror(root1->right, root2->left));
	else
		return false;
}

int main(int argc, char const *argv[])
{
	tNode *root1=NULL, *root2=NULL;
	root1 = createNode(1);
	root1 -> left = createNode(2);
	root1 -> right = createNode(3);
	root1 -> left -> left = createNode(4);
	root1 -> left -> right = createNode(5);
	root1 -> right -> left = createNode(6);
	root1 -> right -> right = createNode(7);

	root2 = createNode(1);
	root2 -> right = createNode(2);
	root2 -> left = createNode(3);
	root2 -> right -> right = createNode(4);
	root2 -> right -> left = createNode(5);
	root2 -> left -> right = createNode(6);
	root2 -> left -> left = createNode(7);

	// root2 -> left -> left -> right = createNode(7);

	string ans = checkMirror(root1, root2) ? "True" : "False";
	cout<<ans<<endl;

	return 0;
}
##include <iostream>

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

void levelOrderTraversal(tnode* root)
{
  
}

int main(int argc, char const *argv[]) {
  tnode *root;
	root = createNode(1);
	root -> left = createNode(2);
	root -> right = createNode(3);

	root -> left -> left = createNode(4);
	root -> left -> right = createNode(5);

	root -> left -> right -> left = createNode(6);
	root -> left -> right -> right = createNode(7);

	root -> left -> right -> right = createNode(9);

	levelOrderTraversal(root);


  return 0;
}

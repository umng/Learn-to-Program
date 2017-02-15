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

void preOrder(tNode *root)
{
	if(!root)
		return;
	cout<<root->data<<" -> ";
	preOrder(root->left);
	preOrder(root->right);
}

void spiralTraverse(tNode *root)
{
	bool flag = false;
	queue<tNode*> q;
	stack<tNode*> s;
	q.push(root);
	q.push(NULL);

	while(!q.empty() || !s.empty())
	{
		tNode* temp = q.front();
		q.pop();
		if(temp!=NULL)
		{
			cout<<temp->data<<"\t";
			if(flag==false)
			{
				flag = true;
				if(temp->left)
					q.push(temp->left);
				if(temp->right)
					q.push(temp->right);
			}
			else
			{
				flag = false;
				if(temp->right)
					q.push(temp->right);
				if(temp->left)
					q.push(temp->left);
			}
		}
		else
		{
			cout<<endl;
			if(!q.empty())
				q.push(NULL);
		}
	}
}

int main(int argc, char const *argv[])
{
	tNode *root =NULL;
	root = createNode(1);
	root -> left = createNode(2);
	root -> right = createNode(3);
	root -> left -> left = createNode(4);
	root -> left -> right = createNode(5);
	root -> right -> left = createNode(6);
	root -> right -> right = createNode(7);

	// cout<<root->left->data<<endl;
	// preOrder(root);
	spiralTraverse(root);

	return 0;
}
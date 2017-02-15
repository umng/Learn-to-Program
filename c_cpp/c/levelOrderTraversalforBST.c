#include<stdio.h>
#include<stdlib.h>

struct treeNode
{
	int d;
	struct treeNode* l;
	struct treeNode* r;
};


///////////////////////      Queue    //////////////////////////////////////////////////

struct node 
{
	struct treeNode* data;
	struct node *next;
};

struct node* head;
struct node* top;

struct node* newNodeQueue(struct treeNode* data)
{
	struct node *newN = (struct node*) malloc(sizeof(struct node));
	newN -> data = data;
	newN -> next = NULL;
	return newN;
}

void enque(struct treeNode* data)
{
	if(head == NULL)
	{
		head = newNodeQueue(data);
		top = head;
	}
	else
	{
		struct node* trav = head;
		while(trav -> next != NULL)
		{
			trav = trav -> next;
		}
		trav  -> next = newNodeQueue(data);
	}
	// printf("Node Added Succesfully\n");
}

struct treeNode* deque()
{
	if(head == NULL)
	{
		// printf("List is NULL\n");
		return NULL;
	}
	else
	{
		struct node* trav = head;
		struct treeNode* temp = trav -> data;
		if(head -> next == NULL)
		{
			head = NULL;
			top = NULL;
		}
		else
		{
			head = head -> next;
		}
		free(trav);
		// printf("POPPED Succesfully\n");
		return temp;
	}
}

////////////////////////////////////////////////////////////////////////////////////////

struct treeNode* root;

struct treeNode* newNode(int data)
{
	struct treeNode *newN = (struct treeNode*) malloc(sizeof(struct treeNode));
	newN -> d = data;
	newN -> l = NULL;
	newN -> r = NULL;
	return newN;
}

void preTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		printf("%d\t", root -> d);
		preTrav(root -> l);
		preTrav(root -> r);
	}
}

void postTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		postTrav(root -> l);
		postTrav(root -> r);
		printf("%d\t", root -> d);
	}
}

void inTrav(struct treeNode* root)
{
	if(root != NULL)
	{
		inTrav(root -> l);
		printf("%d\t", root -> d);
		inTrav(root -> r);
	}
}

struct treeNode* insertNode(struct treeNode* root, int data)
{
	if(root == NULL)
	{
		root = newNode(data);
	}
	else
	{
		if(data < (root -> d))
		{
			root -> l = insertNode(root -> l, data);
		}
		else
		{
			root -> r = insertNode(root -> r, data);
		}
	}
	return root;
}

int c;

int countNode(struct treeNode* root)
{
	if(root != NULL)
	{
		c++;
		countNode(root -> l);
		countNode(root -> r);
	}
	return c;
}

int count = 0;

void levelTrav()
{
	count++;
	struct treeNode* temp = deque();
	if(temp != NULL)
	{
		// enque(trav);
		printf("%d\t",temp -> d);
		if(temp -> l != NULL)	enque(temp -> l);
		if(temp -> r != NULL)	enque(temp -> r);
		levelTrav();
	}
}

int max(int x, int y)
{
	if(x > y)	return x;
	else	return y;
}

int getHeight(struct treeNode* root)
{
	if(root == NULL) return 0;
	return (1 +  max(getHeight(root -> l), getHeight(root -> r)));
}

int getDiameter(struct treeNode* root)
{
	if(root == NULL) return 0;

	int lheight = getHeight(root -> l);
	int rheight = getHeight(root -> r);

	int ldiameter = getDiameter(root -> l);
	int rdiameter = getDiameter(root -> r);

	// return (1 + max(getHeight( root -> l), getHeight( root -> r));
	return max( 1 +lheight + rheight, max(ldiameter, rdiameter));
}

bool isMirror(struct treeNode* root1, struct treeNode* root2)
{
	if(root1 == NULL || root2 == NULL) return true;

	if( (root1 -> l -> d == root2 -> r -> d) && (root2 -> l -> d == root1 -> r -> d) )
	{
		isMirror(root1 -> l, root1 -> r);
		isMirror(root2 -> l, root2 -> r);
		return true;
	}
	else	return false;
}

bool isSymmetric(struct treeNode* root1, struct treeNode* root2)
{
	if(root == NULL) return true;
	return isMirror(root1, root2);
}

bool checkMin(struct treeNode* root1, struct treeNode* root2)
{
	if(root1 -> d <= root2 -> d)	return true;
	else	return false;
}

bool isBST(struct treeNode* root)
{
	if(root == NULL)	return true;

	if(root -> l != NULL && !checkMin(root -> l, root))	return false;
	if(root -> r != NULL &&  !checkMin(root, root -> r))	return false;

	if(root -> l != NULL && root -> r != NULL &&  !( (isBST(root -> l)) && (isBST(root -> r)) ) )	return false;

	return true;
}

int temp = 0;

int getInOrderPredecessor(struct treeNode* root, int data)
{
	if(root != NULL)
	{
		if(getInOrderPredecessor(root -> l, data) != 0)	return getInOrderPredecessor(root -> l, data);
		if(data == root -> d)	return temp;	else	temp = root -> d;
		if(getInOrderPredecessor(root -> r, data) != 0)	return getInOrderPredecessor(root -> r, data);
	}
}

int preArr[] = {2,3,4,5,7,10,12}, postArr[] = {5,3,2,4,10,7,12};

int main()
{
	root = NULL;

	// root = newNode(1);
	// root -> l = newNode(2);
	// root -> r = newNode(3);

	// root -> l -> l = newNode(4);
	// root -> l -> r = newNode(5);

	// root -> r -> r = newNode(6);

	// insertNode(root, 7);
	// insertNode(root, 8);
	// insertNode(root, 9);
	// insertNode(root, 10);
	// insertNode(root, 11);
	// insertNode(root, 12);
	// insertNode(root, 13);
	// insertNode(root, 14);

	// root = insertNode(root, 10);
	// insertNode(root, 7);
	// insertNode(root, 5);
	// insertNode(root, 9);
	// insertNode(root, 15);
	// insertNode(root, 11);
	// insertNode(root, 20);

	// root = insertNode(root, 10);
	// insertNode(root, 7);
	// insertNode(root, 5);
	// insertNode(root, 9);
	// insertNode(root, 15);
	// insertNode(root, 11);
	// insertNode(root, 20);

	root = insertNode(root, 10);
	insertNode(root, 7);
	insertNode(root, 9);
	insertNode(root, 5);
	insertNode(root, 15);
	insertNode(root, 11);
	insertNode(root, 20);


	printf("\nPre-Order Trversal:\t");
	preTrav(root);
	printf("\nPost-Order Trversal:\t");
	postTrav(root);
	printf("\nIn-Order Trversal:\t");
	inTrav(root);

	countNode(root);
	printf("\nCount:\t%d\n", c);
	printf("\n\nLevel Wise Trversal:\t");
	enque(root);
	levelTrav();
	printf("Complexity: O(%d)\t---->\tO(n + %d)\n", count, count - c);

	printf("\nHeight: %d\t", getHeight(root));
	printf("\nDiameter: %d\t", getDiameter(root));
	printf("\nSymmetric: %d\t", isSymmetric(root, root));
	printf("\nIs BST: %d\t", isBST(root));
	int n = 11;
	getInOrderPredecessor(root, n);
	printf("\nIn Order Predecessor of %d : %d\tTemp:%d\n", n, getInOrderPredecessor(root, n), temp);
	
}
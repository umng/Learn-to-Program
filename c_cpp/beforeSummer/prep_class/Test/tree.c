#include<stdio.h>
#include<math.h>
#include<stdlib.h>

struct tree 
{
	int data;
	struct tree * l;
	struct tree * r;
};
struct tree * root;

struct tree * newNode(int data)
{
	struct tree * ptr=(struct tree *)malloc(sizeof(struct tree));
	ptr->data=data;
	ptr->l=NULL;
	ptr->r=NULL;
	return ptr;
}
void insert( struct tree * head,int data)
{
	if(root==NULL)
	{
		root=newNode(data);
		return ;
	}
	if(head->data > data)
	{
		if(head->l==NULL)
		{
			head->l=newNode(data);
			
		}
		else
		insert(head->l,data);
	}
	else
	{
		if(head->r==NULL)
		{
			head->r=newNode(data);
			return;
		}
		else
		insert(head->r,data);
	}
	
}

void preorder(struct tree *  head)
{
	if(head!=NULL)
	{
		printf("%d\t",head->data);
		preorder(head->l);
		preorder(head->r);
	}
	else
	{
		return ;
	}
}
struct tree * ptr;

void printTree(struct tree * head)
{
	if(head==NULL)
	{
		return;
	}
	ptr=head;
	int count=0;
	while(ptr!=NULL)
	{
		printf("%d\t ",ptr->data);
		ptr=ptr->l;
		count++;
	}
	ptr=head;
	while(count!=0)
	{
		ptr=ptr->r;
		count--;
	}
	printTree(ptr);
}
void printTree2(struct tree * head)
{
	if(head==NULL)
	{
		return;
	}
	ptr=head;
	int count=0;
	while(ptr!=NULL)
	{
		printf("%d\t ",ptr->data);
		ptr=ptr->r;
		count++;
	}
	ptr=head;
	while(count!=0)
	{
		ptr=ptr->l;
		count--;
	}
	printTree(ptr);
}
int main()
{
	insert(root,12);
	insert(root,5);
	insert(root,13);
	insert(root,25);
	insert(root,40);
	insert(root,45);
	insert(root,49);
	//	insert(root,8);
	
	preorder(root);
	printf("\nLeft View\n");
	printTree(root);
	printf("\nright View\n");
//	printTree2(root);
}

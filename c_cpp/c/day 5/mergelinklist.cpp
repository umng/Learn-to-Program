#include<iostream>
using namespace std;

struct node{
	int data;
	node* next;
}*head=NULL;

void ins(int x)
{
	node* ptr=new node();
	ptr->data=x;
	ptr->next=NULL;
	if(head==NULL)
	{
		ptr->next=head;
		head=ptr;
	}
	else{
		ptr->next=head;
		head=ptr;
	}
}

void print()
{
	node* ptr=head;
	
	while(ptr!=NULL)
	{
		cout<<ptr->data<<endl;
		ptr=ptr->next;
	}
}

int main()
{
	cout<<"enter the no.s in linklist 1";
	ins(1);
	ins(3);
	ins(6);
	
	print();
}

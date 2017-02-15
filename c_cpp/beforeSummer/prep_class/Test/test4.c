#include <stdio.h>
#include <stdlib.h>

struct list
{
	int data;
	struct list *next;
	struct list *child;
};

struct list *head;

struct list *newNode(int data)
{
	struct list *l = (struct list *) malloc(sizeof(struct list));
	l -> data = data;
	l -> next = NULL;
	l -> child = NULL;
}

struct list insertNextNode(int data, int after)
{
	
}

struct list insertChildNode(int data, int after)
{

}

int main(int argc, char const *argv[])
{
	/* code */
	return 0;
}
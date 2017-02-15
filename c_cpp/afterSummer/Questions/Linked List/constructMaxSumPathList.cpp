#include <iostream>

using namespace std;

typedef struct node{
  int data;
  node* next;
}lNode;

lNode* createNode(int data){
  lNode* n = new lNode();
  n -> data = data;
  n -> next = NULL;
  return n;
}

lNode* getMaxSumPathList(lNode* head1, lNode* head2)
{
	lNode *head, *tHead1=head1, *tHead2=head2, *trav1=head1, *trav2=head2, *tempHead;
	int sum1 = 0, sum2 = 0;
	bool flagSetted = false;

	while(trav1 != NULL || trav2 != NULL)
	{
		// if(trav1 -> data == trav2 -> data)
		// {
		// 	if(sum1 > sum2)
		// 	{
		// 		tempHead -> next = tHead1 -> next;
		// 		tempHead = tHead1 = trav1;
		// 	}
		// 	else
		// 	{
		// 		tempHead -> next = tHead2 -> next;
		// 		tempHead = tHead2 = trav2;
		// 	}

		// 	trav1 = trav1 -> next;
		// 	trav2 = trav2 -> next;
		// 	sum1 = trav1 -> data;
		// 	sum2 = trav2 -> data;
		// 	if(flagSetted == false)
		// 	{
		// 		head = tempHead;
		// 		flagSetted = true;
		// 	}
		// }
		// else
		// {
		// 	if(sum1 > sum2)
		// 	{
		// 		trav2 = trav2 -> next;
		// 		sum2 += trav2 -> data;
		// 	}
		// 	else
		// 	{
		// 		trav1 = trav1 -> next;
		// 		sum1 += trav1 -> data;
		// 	}
		// }
	}
	return head;
}

int main(int argc, char const *argv[]) {
  lNode *head1 = createNode(1);
  head1->next = createNode(3);
  head1->next->next = createNode(30);
  head1->next->next->next = createNode(90);
  head1->next->next->next->next = createNode(120);
  head1->next->next->next->next->next = createNode(240);
  head1->next->next->next->next->next->next = createNode(511);

  lNode *head2 = createNode(0);
  head2->next = createNode(3);
  head2->next->next = createNode(12);
  head2->next->next->next = createNode(32);
  head2->next->next->next->next = createNode(90);
  head2->next->next->next->next->next = createNode(125);
  head2->next->next->next->next->next->next = createNode(240);
  head2->next->next->next->next->next->next->next = createNode(249);

  lNode *head = getMaxSumPathList(head1, head2);

  //print list
  while(head != NULL)
  {
  	cout << head -> data << "  ->  ";
  	head = head -> next;
  }

  return 0;
}

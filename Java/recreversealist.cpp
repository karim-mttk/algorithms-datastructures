#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;
struct Node{
	int data;
	struct Node* next;
};
	struct Node* head;

void Insert(int d){
	Node* temp1 = new Node();
	temp1->data = d;
	temp1->next = head;	
	head = temp1;
}

void Print()
{
  struct Node* temp = head;
  cout<<"List is: ";
  while(temp != NULL){

	cout<<"->"<<temp->data;
	temp = temp->next;
  }
}

void printrec(struct Node *n){

   if(n==NULL)return;

   cout<<"->"<<n->data;
   printrec(n->next);
}

void ReverseRec(struct Node* p){

	if(p->next==NULL)
	{head = p;
	return;
	}
	
	ReverseRec(p->next);
	//p->next->next=p;
	struct Node* q = p->next;
	q->next=p;
	p->next= NULL;	
}

void Delete(int n){

	 struct Node* temp1 = head;
	     if(n == 1){
		head = temp1->next;
		free(temp1);
	     return;
             }
	int i;
	for(i = 0; i<n-2; i++){
		temp1 = temp1->next; 
		// temp1 points to (n-1)th Node
		struct Node* temp2 = temp1->next; //nth node
		temp1->next = temp2->next;// (n+1)th node
		free(temp2); 	
	}	
}

void Reverse(){
	struct Node *current, *prev, *next;

	current = head;
	prev = NULL;
	
	while(current != NULL){
	next = current->next;
	current->next = prev;
	prev = current;
	current = next;
        }
	head = prev;
}

int main(){
   head = NULL; //empty list
   Insert(8);
   Insert(7);
   Insert(6);
   Insert(5);
   Insert(4);
   Insert(3);
   Insert(2);
   Insert(1);
   Print();
   
   ReverseRec(head);
   Print();
   
   
      
 return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;


struct Node{
	int data;
	struct Node* next;
};
struct Node* head = NULL;


void Push(int d){
	Node* temp1 = new Node();
	temp1->data = d;
	temp1->next = head;	
	head = temp1;
}


void Pop(){
     if(head == NULL) return;
     struct Node* temp1 = head;
     head = head->next;
     free(temp1);
}


void Print()
{
	struct Node* temp = head;
	cout<<"List is: ";
	while(temp != NULL){
	cout<<"->"<<temp->data;
	temp = temp->next;
	}
	cout<<"\n";
}


int main()
{
   Push(7);
   Push(6);
   Push(5);
   Push(4);
   Print();
   Pop();
   Print();	
   Push(2);
   Push(1);
   Print();
		
   return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <cstring>
#include <stack>
using namespace std;

void Reverse(char *C, int n){
	stack<char> S;
	//push	
	for(int i = 0; i<n; i++){
	S.push(C[i]);
	}
	//pop
	for(int i = 0; i<n; i++){
		C[i] = S.top();
		S.pop();
	}
}

int main()
{
	char C[51];
	cout<<"Enter a string: ";
	cin>>C;
	Reverse (C, strlen(C));
	cout<<"Output = "<<C;
                                      
 	return 0; 	
}

#include<iostream>using namespace std;int average_min_max(vector<int>& array){	int n = array.size();		int min = DBL_MAX;	int max = DBL_MIN;		for(int i = 0; i<n; i++){		if(aray[i]<min)min=array[i];		if(array[i]>max)max=array[i];	} 	return (min+max)/2;}
//merge sort 
#include<stdio.h>

int merge(int a[],int i,int m,int j)
{
	int p,q,k,index;
	int n1=m-i+1;
	int n2=j-m;
	int l[n1],r[n2];
	for(k=0;k<n1;k++)
	l[k]=a[k+i];
	for(k=0;k<n2;k++)
	r[k]=a[k+m+1];
	
	 p=0;q=0;index=i;
	
	
	while(p<n1 && q<n2)
	{
		if(l[p]<r[q]){
		a[index]=l[p];
		p++;index++;
		}
		else
		{
			a[index]=r[q];
			q++;
			index++;
		}
	
	}
	
	while(p<n1)
	{
		a[index]=l[p];
		index++;
		p++;
	}
	while(q<n2)
	{
		a[index]=r[q];
		q++;
		index++;
	}
	
}

int mergesort(int a[],int i,int j)
{
	if(i<j)
	{
	
	int m=(i+j)/2;
	mergesort(a,i,m);
	mergesort(a,m+1,j);
	merge(a,i,m,j);
	
	}
}


void printArray(int a[],int n)
{
	int i=0;
	printf("\nArray is : \n");
	for(i=0;i<n;i++)
	{
	   printf("\t%d",a[i]);	
    }
}


int main()
{
	int a[]={6,5,4,3,2,1};
	int n=sizeof(a)/sizeof(a[0]);
	
	printArray(a,n);
	mergesort(a,0,n-1);
	printArray(a,n);
	return 0;
}

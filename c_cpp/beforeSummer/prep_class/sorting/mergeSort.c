#include <stdio.h>

// int c[6] = {0};

// void merge(int a[], int x, int y, int z)
// {
//   int k = 0, i, j, n, m;
//   i = 0;
//   j = 0;
//   n = (y - x);
//   m = (z - y);

//   for( ; k < n && k < m; )
//   {
//     if(a[x + i] < a[x + j])   c[k++] = a[i++];
//     else   c[k++] = a[j++];
//   }

//   for( ; i < n; )   c[k++] = a[i++];
//   for( ; j < m; )   c[k++] = a[j++];
// }

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
    if(l[p]<r[q])
    {
      a[index]=l[p];
      p++;  index++;
    }
    else
    {
      a[index]=r[q];
      q++;  index++;
    }
  
  }
  
  while(p<n1)
  {
    a[index]=l[p];
    p++;  index++;
  }
  while(q<n2)
  {
    a[index]=r[q];
    q++;  index++;
  }
  
}


void mergeSort(int a[], int i, int j)
{
  if(j > i)
  {
    int m = (i + j) / 2;
    mergeSort(a, i, m);
    mergeSort(a, m + 1, j);
    merge(a, i, m, j);
  }
}

int main(int argc, char const *argv[])
{
  int arr[] = {5, 2, 10, 4, 1, 3};
  int i = 0, n = 6;

  mergeSort(arr, 0, n - 1);  // sort the array

  printf("\nSorted array:\t");  // print sorted array
  for(i = 0; i < n; i++)
    printf("%d\t",arr[i]);

  return 0;
}


























/**
  * Divide  : Divide the n-element array into two n/2-element
  *           sub-arrays
  * Conquer : Sort the two sub-arrays recursively using
  *           merge sort
  * Combine : Merge the two sorted subsequences to form the
  *           sorted array
  **

#include<stdio.h>

int arr[20];       // array to be sorted

int merge(int arr[],int l,int m,int h)
{
  int arr1[10],arr2[10];  // Two temporary arrays to
  //hold the two arrays to be merged
  int n1,n2,i,j,k;
  n1=m-l+1;
  n2=h-m;

  for(i=0; i<n1; i++)
    arr1[i]=arr[l+i];
  for(j=0; j<n2; j++)
    arr2[j]=arr[m+j+1];

  arr1[i]=9999;  // To mark the end of each temporary array
  arr2[j]=9999;

  i=0;
  j=0;
  for(k=l; k<=h; k++) { //process of combining two sorted arrays
    if(arr1[i]<=arr2[j])
      arr[k]=arr1[i++];
    else
      arr[k]=arr2[j++];
  }

  return 0;
}

int merge_sort(int arr[],int low,int high)
{
  int mid;
  if(low<high) {
    mid=(low+high)/2;
    // Divide and Conquer
    merge_sort(arr,low,mid);
    merge_sort(arr,mid+1,high);
    // Combine
    merge(arr,low,mid,high);
  }

  return 0;
}



int main()
{
  int n,i;

  // printf("Enter the size of array\n");  // input the elements
  // scanf("%d",&n);
  // printf("Enter the elements:");
  // for(i=0; i<n; i++)
  //   scanf("%d",&arr[i]);

  int arr[] = {2, -1, 5, -3, 9, -9};
  n = 6;

  merge_sort(arr,0,n-1);  // sort the array

  printf("Sorted array:");  // print sorted array
  for(i=0; i<n; i++)
    printf("%d\t",arr[i]);

  return 0;
}
*/
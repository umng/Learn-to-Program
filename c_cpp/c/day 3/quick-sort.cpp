#include <iostream>
using namespace std;

void swap(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

int partition(int arr[], int low, int high)
{
    int i = low - 1;
    int j = low;
    int pivot = arr[high];
    while( j < high )
    {
        if (arr[j] <= pivot)
        {
            i++;
            swap(arr + i, arr +j);   
        }
        j++;
    }
    i++;
    swap(arr + i, arr + high);
    return i; 
}

void quick_sort(int arr[], int low, int high)
{
    if (low < high)
    {
        int p = partition(arr, low, high);
        quick_sort(arr, low, p - 1);
        quick_sort(arr, p + 1, high);
    }
}

int main()
{
    int arr[] = {4, 5, 1, 7, 2, 9};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    quick_sort(arr, 0, n -1);
    
    for(int i=0;i<n;i++)
    {
        cout << arr[i] << " ";
    }
}
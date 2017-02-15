#include <iostream>
using namespace std;

int findRotation(int arr[], int n)
{
    int low = 0;
    int high = n;
    
    while (low < high)
    {
        int mid = (low + high)/2;
        if (arr[mid] < arr[low])
            high = mid;
        else if (arr[mid] > arr[low])
            low = mid + 1;
        else if (low == mid)
            return arr[low] > arr[high] ? high : low;
    }
    
}


int main()
{
    int arr[] = {12, 13, 17, 2, 4, 7, 9};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    cout << findRotation(arr, n);
}
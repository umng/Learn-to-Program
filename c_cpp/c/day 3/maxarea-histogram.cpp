#include <iostream>
using namespace std;

int maxarea_simple(int arr[], int n)
{
    int maxArea = 0;
    
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            int minHeight = min(arr[i], arr[j]);
            for(int k=j+1;k<j;k++)
            {
                if (arr[k] < minHeight) minHeight = arr[k];
            }
            
            int area = minHeight*(j-i);
            maxArea = max(area, maxArea);
        }
    }
    
    return maxArea;
}

int main()
{
    int arr[] = {2,1,5,6,2,3};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    cout << maxarea_simple(arr, n);
}
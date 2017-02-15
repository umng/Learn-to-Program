#include<stdio.h>
#include<time.h>
int i = 0, j = 0, k = 0, swap=0, x = 0, temp = 0;
clock_t begin, end;
double time_spent;

int bubble_sort(int a[], int n)
{
  for(i = 0; i < n; i++)
  {
    for(j = 0; j < n-i; j++)
    {
      if(a[j] > a[j+1])
      {
        swap = a[j];
        a[j] = a[j+1];
        a[j+1] = swap;
        for(k = 0; k < 8; k++)
        {
          printf("%d\t", a[k]);
        }
        printf("\n");
      }
      x++;
    }
  }
}

int selection_sort(int a[], int n)
{
  for(i = 0; i < n; i++)
  {
    temp = i;
    for(j = i; j < n; j++)
    {
      if(a[temp] > a[j])
      {
        temp = j;
      }
      x++;
    }
    if(a[i] > a[temp])
    {
      swap = a[i];
      a[i] = a[temp];
      a[temp] = swap;
      for(k = 0; k < 8; k++)
      {
        printf("%d\t", a[k]);
      }
      printf("\n");
    }
  }
}

int main(int argc, char const *argv[]) {
  begin = clock();
  int a[] = {13, 1, 8, 2, 5, 4, 12, 11};
  // int a[] = {1, 1, 1, 1, 1, 1, 1, 1};
  // bubble_sort(a, 8);
  selection_sort(a, 8);

  // for(i = 0; i < 8; i++)
  // {
  //   printf("%d\t", a[i]);
  // }

  end = clock();
  time_spent = (double) (end - begin);
  printf("\nComplexity:\t%d\nExecution Time:\t%f\n", x, time_spent );
  return 0;
}

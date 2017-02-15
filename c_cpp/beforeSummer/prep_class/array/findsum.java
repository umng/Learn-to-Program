public class findsum{
  public void findsumarray(int arr[],int k,int len)
  {
  sort(arr,len);
  }
  public void sort(int arr,int len)
  {int i;
    int j;
    int temp;
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)

        if(arr[i]>ar[j])
        {

          temp=arr[i];
          a[i]=arr[j];
          arr[j]=temp;
        }
    }
    for(i=0;i<n;i++)
    {
      System.out.println(arr[i]+ " ");
    }
  }

  public static void main(String args[])
  {
    int a[]={10,1,3,0,2,5};
    int len=a.length;
    System.out.println(len);
    findsum f=new findsum();
    f.findsumarray(a,10,len);
  }
}

 import java.io.*;

 class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of wickets");
        int n=Integer.parseInt(br.readLine());
            Wicket[] wicket = new Wicket[n];
            WicketBO wb = new WicketBO();
for(int i=0;i<n;i++)
{
System.out.println("Enter the details of wicket "+(i+1));
String Str=br.readLine();
String[]  array = Str.split(",");
Long t=Long.parseLong(array[0]);
Long t1=Long.parseLong(array[1]);
wicket[i] = new Wicket(t,t1,array[2],array[3],array[4]);
}
wb.displayAllWicketDetails(wicket);
System.out.println("Enter the wicket type to be searched");
String type=br.readLine();
wb.displaySpecificWicketDetails(wicket,type);
}
}

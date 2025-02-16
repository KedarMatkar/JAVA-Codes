import java.util.Scanner;

public class Stockspan 
{
    public static void main(String args[])
    {
        int arr[]={100,80,60,70,60,75,85};
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+"\t");
        }
        int span[]=new int[7];
        span[0]=1;
        for(int i=1;i<7;i++)
        {
            if(arr[i]<arr[i-1])
            {
                span[i]=1;
            }
            else
            {
                span[i]=2*2*2;
            }
        }
        System.out.println();
        for(int i=0;i<span.length;++i)
        {
            System.out.print(span[i]+"\t");
        }
    }
}


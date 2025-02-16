import java.util.Scanner;

public class Diff2arrays
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scammer(System.in);
        int flag=0;
        int num1[]={1,2,3};
        int num2[]={2,4,6};
        int arr1[]=new int[2];
        int arr2[]=new int[2];
        for(int i=0;i<=num1.length;i++)
        {
            for(int j=0;j<num2.length;j++)
            {
                if(num1[i]=num2[i])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                arr1[i]+num1[i];
            }
        }
    }
}

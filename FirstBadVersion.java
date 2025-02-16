import java.util.Scanner;

class firstbadversion
{
    public void isBadVersion(int n,int bad)
    {

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n, bad;
        System.out.print("Enter the number of a version:");
        n=sc.nextInt();
        System.out.print("Enter bad version:");
        bad=sc.nextInt();
        for( int i=1;i<=n;i++)
        {
            if(i>=bad)
            {
                System.out.println("is a bad version: True");
            }
            else
            {
                System.out.println("is a bad version: False");
            }
        }
    }
}
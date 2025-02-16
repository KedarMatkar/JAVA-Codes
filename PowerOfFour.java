import java.util.Scanner;

class poweroffour
{
    public void pof(int n)
    {
        boolean flag = false;
        for(int i=1;i<=n;i++)
        {
            if(Math.pow(i,4)==n)
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        poweroffour p=new poweroffour();
        System.out.print("Enter the number:");
        int n;
        n=sc.nextInt();
        p.pof(n);
    }
}


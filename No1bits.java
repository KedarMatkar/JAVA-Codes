import java.util.Scanner;

public class No1bits 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int counter=0;
        System.out.println("Enter the number in binary:");
        String str=sc.next();
        int len=str.length();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
        if(len==32)
        {
            for(int i=0;i<32;i++)
            {
                if(ch[i]=='1')
                {
                    counter+=1;
                }
            }
        }
        else
        {
            System.out.println("Number of digits should be 32:");
        }
        System.out.print("The number of 1's: " +counter);
    }
}

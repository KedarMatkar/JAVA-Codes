import java.util.Scanner;

public class Validpalindrome
{
    public void palindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str1=sc.next();
        str1=str1.toLowerCase();
        char c;
        String str2="";
        char ch[]=str1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            c=ch[i];
            str2=c+str2;
        }
        if(str1.equals(str2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args) 
    {
        Validpalindrome t=new Validpalindrome();
        t.palindrome();
    }
}

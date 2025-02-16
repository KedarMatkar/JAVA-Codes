import java.util.Scanner;

class FannysOccurence 
{
    public static void main(String[] args) 
    {
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER STRING:");
        String str = sc.nextLine();
        int len = str.length();
        char ch1[] = str.toCharArray();
        System.out.print("Enter character to delete:");
        char c = sc.next().charAt(0);
        for(int i=0;i<str.length();i++) 
        {
            if(ch1[i]==c) 
            {
                continue;
            }
            else 
            {
                str1 = str1 + ch1[i];
            }
        }
        System.out.println("New string:"+str1);
    }
}
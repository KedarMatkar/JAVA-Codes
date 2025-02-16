import java.util.Scanner;

public class MagicBoard
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter elements:");
        for(int i=0;i<4;i++) 
        {
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<4;j++) 
        {
            char ch = (char)arr[j];
            System.out.print(arr[j]+"-->"+ch+"\t");
        }
    }
}


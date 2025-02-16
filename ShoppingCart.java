import java.util.ArrayList;
import java.util.Scanner;

class Store 
{
    ArrayList<Integer> al=new ArrayList<>();
    ArrayList<String> al1 = new ArrayList<>();
    ArrayList<Integer> al2 = new ArrayList<>();
}

class ShoppingCarts extends Store
{
    Scanner sc = new Scanner(System.in);
    public void addItems() 
    {
        System.out.print("Enter Item ID:");
        int id = sc.nextInt();
        al.add(id);
        System.out.print("Enter Item Name:");
        String str1 = sc.next();
        al1.add(str1);
        System.out.print("Enter Item Price:");
        int amount = sc.nextInt();
        al2.add(amount);
    }

    public void showItems() {

        System.out.println();
        System.out.println("Item Details");
        System.out.println("Item-ID"+"\t"+"Item Name"+"\t"+"Item Price");
        System.out.println("********************************");
        for(int i=0;i<al.size();i++) 
        {
            System.out.println(al.get(i)+"\t"+al1.get(i)+"\t"+al2.get(i));
        }
        System.out.println();
    }

    public void deleteItems() 
    {
        System.out.print("Enter the item id to remove:");
        int item = sc.nextInt();
        for(int i=0;i<al.size();i++) 
        {
            if(item==al.get(i)) 
            {
                al.remove(al.get(i));
                al1.remove(al1.get(i));
                al2.remove(al2.get(i));
            }
        }
        System.out.println("updates list");
        System.out.println("Item-ID"+"\t"+"Item Name"+"\t"+"Item Price");
        System.out.println("********************************");
        for(int i=0;i<al.size();i++) {
            System.out.println(al.get(i)+"\t"+al1.get(i)+"\t"+al2.get(i));
        }
    }

    public void updateItems() 
    {
        System.out.print("Enter Id to be updated:");
        int up = sc.nextInt();
        System.out.print("Enter new id:");
        int newid = sc.nextInt();
        System.out.print("Enter new name:");
        String newstr = sc.next();
        System.out.print("Enter new price:");
        int newprice = sc.nextInt();
        for(int i=0;i<al.size();i++) 
        {
            if(up==al.get(i)) 
            {
                al.set(i, newid);
                al1.set(i, newstr);
                al2.set(i, newprice);
                break;
                }
        }
        System.out.println("updates list");
        System.out.println("Item-ID"+"\t"+"Item Name"+"\t"+"Item Price");
        System.out.println("********************************");
        for(int i=0;i<al.size();i++) 
        {
            System.out.println(al.get(i)+"\t"+al1.get(i)+"\t"+al2.get(i));
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc1 = new Scanner(System.in);
        ShoppingCarts ad = new ShoppingCarts();
        while(true) {
            System.out.println("1. Add Items");
            System.out.println("2. Show Items");
            System.out.println("3. Delete Items");
            System.out.println("4. Update Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            int ch = sc1.nextInt();
            if(ch==1) {
                ad.addItems();
            }
            else if(ch==2) {
                ad.showItems();
            }
            else if(ch==3) {
                ad.deleteItems();
            }
            else if(ch==4) {
                ad.updateItems();
            }
            else if(ch>5) {
                System.out.println("Invalid Input");
            }
            else if(ch==5) {
                break;
            }
        }
    }
}
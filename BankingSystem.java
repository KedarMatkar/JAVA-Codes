import java.util.Scanner;

abstract class BankAccount 
{
    int accno, deposit;
    double balance;
    String cname;
    String city;
    Scanner sc = new Scanner(System.in);
    abstract public void deposit();
    abstract public void withdraw();
    public void inputData()
    {
        System.out.print("Enter you account no:");
        accno = sc.nextInt();
        System.out.print("Enter name:");
        cname = sc.next();
        System.out.print("Enter city:");
        city = sc.next();
        System.out.print("Enter balance:");
        balance = sc.nextInt();
    }
    public void display() 
    {
        System.out.println("Account No:"+accno);
        System.out.println("Name:"+cname);
        System.out.println("City:"+city);
        System.out.println("Balance:"+balance);
    }
}

class SavingsAccount extends BankAccount 
{
    public void deposit() 
    {
        System.out.print("Enter amount to deposit:");
        deposit = sc.nextInt();
        super.balance+=deposit;
    }
    public void withdraw()
    {
        System.out.print("Enter ammount to be withdrawn:");
        int withdraw_amount = sc.nextInt();
        if(super.balance-withdraw_amount>=1000 || withdraw_amount<=1000)
        {
            super.balance -= withdraw_amount;
        }
        else 
        {
            System.out.println("Hey buddy!, your account balance will be less then the required balance.");
        }
    }
} 

class CurrentAccount extends BankAccount 
{
    public void deposit() 
    {
        System.out.print("Enter amount to deposit:");
        deposit = sc.nextInt();
        super.balance+=deposit;
    }
    public void withdraw()
    {
        System.out.print("Enter ammount to be withdrawn:");
        int withdraw_amount = sc.nextInt();
        if(super.balance-withdraw_amount>=1000 || withdraw_amount<=1000)
        {
            super.balance -= withdraw_amount;
        }
        else 
        {
            System.out.println("Hey buddy!, your account balance will be less then the required balance.");
        }
    }
}

class Interest1 extends SavingsAccount
{
    void interest() 
    {
        System.out.println("Balance before interest:"+super.balance);
        super.balance=0.4*super.balance;
        System.out.println("Balance after interest in savings account:"+super.balance);
    }
}

class Interest2 extends CurrentAccount 
{
    void interest() 
    {
        System.out.println("Balance before interest:"+super.balance);
        super.balance=0.2*super.balance;
        System.out.println("Balance after interest in current account:"+super.balance);
    }
}

public class BankingSystem 
{
     public static void main(String[] args) 
     {
        Scanner sc1 = new Scanner(System.in);
        Interest1 a = new Interest1();
        Interest2 b = new Interest2();

        while(true)
        {
            System.out.print("Enter choice 1. Savings account  2. Current account  3. Exit:");
            int choice1 = sc1.nextInt();
            switch (choice1) 
            {
                case 1:
                    System.out.println("\n1. Input");
                    System.out.println("2. Display");
                    System.out.println("3. Deposit");
                    System.out.println("4. Withdraw");
                    System.out.println("5. Interest");
                    System.out.println("6. Exit");
                    System.out.print("Enter your choice:");
                    int choice = sc1.nextInt();
                    if(choice==1)
                    {
                        a.inputData();
                    }
                    else if(choice==2)
                    {
                        a.display();
                    }
                    else if(choice==3)
                    {
                        a.deposit();
                    }
                    else if(choice==4)
                    {
                        a.withdraw();
                    }
                    else if(choice==5)
                    {
                        a.interest();
                    }
                    else if(choice==6) {
                        break;
                    }
                    else if(choice>6) {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.println("\n1. Input");
                    System.out.println("2. Display");
                    System.out.println("3. Deposit");
                    System.out.println("4. Withdraw");
                    System.out.println("5. Interest");
                    System.out.println("6. Exit");
                    System.out.print("Enter your choice:");
                    int choice2 = sc1.nextInt();
                    if(choice2==1)
                    {
                        b.inputData();
                    }
                    else if(choice2==2)
                    {
                        b.display();
                    }
                    else if(choice2==3)
                    {
                        b.deposit();
                    }
                    else if(choice2==4)
                    {
                        b.withdraw();
                    }
                    else if(choice2==5)
                    {
                        b.interest();
                    }
                    else if(choice2==6) {
                        break;
                    }
                    else if(choice2>6) {
                        System.out.println("Invalid choice");
                    }
                case 3:
                    break;
            }
            if(choice1==3) 
            {
                break;
            }
        }
    }
}
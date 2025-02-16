import java.util.Scanner;

class Student
{
	Scanner sc=new Scanner(System.in);
	int rollno[]=new int[10]; 
	long mob[]=new long[10];
	String sname[]=new String[10];
	String address[]=new String[10];
	int i=0;
	public void inputData()
	{
		System.out.println("Enter rollno:");
		rollno[i]=sc.nextInt();
		System.out.println("Enter mobile no:");
		mob[i]=sc.nextLong();
		System.out.println("Enter name:");
		sname[i]=sc.next();
		System.out.println("Enter address:");
		address[i]=sc.next();
		++i;
	}
	public void showData()
	{
		System.out.println("Rollno\tName\tMobileNo\tAddress");
		System.out.println("--------------------");
		for(int k=0;k<i;k++)
		{
			System.out.println(rollno[k]+"\t"+sname[k]+"\t"+mob[k]+"\t"+address[k]);
		}
	}
	public void update()
	{
		System.out.println("Enter rollno:");
		int rn=sc.nextInt();
		System.out.println("Enter what data to update ie 1.Rollno 2.Name 3.Mobile no 4.Address");
		int choice=sc.nextInt();
		int flag=0;
		int ked=0;
		for(int u=0;u<i;u++)
		{
			if(rollno[u]==rn)
			{
				flag=u;
				ked=1;
			}
		}
		if(ked!=1)
		{
			System.out.println("Enter a valid phone number:");
		}
		switch(choice)
		{
			case 1:
				System.out.println("Enter rollno:");
				rollno[flag]=sc.nextInt();
				break;
			case 2:
				System.out.println("Enter name:");
				sname[flag]=sc.next();
				break;
			case 3:
				System.out.println("Enter mobile number:");
				mob[flag]=sc.nextLong();
				break;
			case 4:
				System.out.println("Enter address:");
				address[flag]=sc.next();
				break;
			default:
				System.out.println("Enter valid choice");
		}
	}
	public void delete()
	{
		System.out.println("Enter studentroll no:");
		int r=sc.nextInt();
		int flag=0;
		for(int u=0;u<i;u++)
		{
			if(rollno[u]==1)
			{
				flag=u;
				for(int g=u;g<i-1;g++)
				{
					rollno[g]=rollno[g+1];
					mob[g]=mob[g+1];
					sname[g]=sname[g+1];
					address[g]=address[g+1];
				}
			}
		}
		i--;
	}
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		Student inf=new Student();
		while(true)
		{
			System.out.println("1. Input Data");
			System.out.println("2. Show info");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			int ch=sc1.nextInt();
			if(ch==1)
			{
				inf.inputData();
			}
			else if(ch==2)
			{
				inf.showData();
			}
			else if(ch==3)
			{
				inf.update();
			}
			else if(ch==4)
			{
				inf.delete();
			}
			else if(ch>5)
			{
				System.out.println("Invalid choice");
			}
			else if(ch==5)
			{
				break;
			}
		}
		
	}
}
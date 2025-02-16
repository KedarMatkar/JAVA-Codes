import java.util.Scanner;


class Calculator
{
	Scanner sc = new Scanner(System.in);
    int r,l,b,s,h;
    final float PI=3.14f;
    public void areaOfCircle()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        float area=PI*r*r;
        System.out.print("Area of Circle is :"+area);
    }
    public void circumferenceOfCircle()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        float circumference=2*PI*r;
        System.out.print("Circumference of circle is:" +circumference);
    }
    public void areaOfRectangle()
    {
        System.out.println("Enter length:");
        System.out.println("Enter breadth:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int rec=l*b;
        System.out.println("Area of rectangle is:" +rec);
    }
    public void perimeterOfRectangle()
    {
        System.out.println("Enter length:");
        System.out.println("Enter breadth:");
        l=sc.nextInt();
        b=sc.nextInt();
        int peri=2*(l+b);
        System.out.println("Perimeter of rectangle is:" +peri);
    }
    public void volumeOfSphere()
    {
        System.out.println("Enter radius r:");
        r=sc.nextInt();
        float vol=4/3*PI*r*r*r;
        System.out.println("Volume of sphere is:" +vol);
    }
    public void surfaceAreaOfSphere()
    {
        System.out.println("Enter radius r:");
        r=sc.nextInt();
        float vol=4*PI*r*r;
        System.out.println("Surface area of sphere is:" +vol);
    }
    public void areaOfSquare()
    {
        System.out.println("Enter side of square:");
        s=sc.nextInt();
        int sqarea=s*s;
        System.out.println("Area of square is:" +sqarea);
    }
    public void areaOfRightAngleTriangle()
    {
		int base,h;
        System.out.println("Enter length of base:");
        System.out.println("Enter lenght of height:");
        base= sc.nextInt();
        h= sc.nextInt();
        float tarea=0.5f*base*h;
        System.out.println("Area of Right Angle Triangle:" +tarea);
    }

    public static void main(String args[])
    {
		Scanner sc1 = new Scanner(System.in);
		Calculator c = new Calculator();
		while(true)
		{
		    System.out.println("Select any option:");
		    System.out.println("1. Area of Circle:");
		    System.out.println("2. Circumference of Circle:");
		    System.out.println("3. Area of Rectangle:");
		    System.out.println("4. Perimeter of Rectangle:");
		    System.out.println("5. Area of Square:");
		    System.out.println("6. Volume of Sphere:");
		    System.out.println("7. Surface Area of Sphere:");
		    System.out.println("8. Area of Right Angle Triangle:");
		    System.out.println("9. Exit");
		    int ch=sc1.nextInt();
				if(ch==1)
				{
					c.areaOfCircle();
				}
				else if(ch==2)
				{
					c.circumferenceOfCircle();
				}
				else if(ch==3)
				{
					c.areaOfRectangle();
				}
				else if(ch==4)
				{
					c.perimeterOfRectangle();  
				}
				else if(ch==5)
				{
					  c.areaOfSquare();
				}
				else if(ch==6)
				{
					 c.volumeOfSphere();
				}
				else if(ch==7)
				{
					c.surfaceAreaOfSphere();
				}
				else if(ch==8)
				{
					 c.areaOfRightAngleTriangle();
				}
				else if(ch==9)
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid input");
				}
				
		}
       
    }
}

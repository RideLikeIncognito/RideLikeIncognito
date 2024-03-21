import java.util.Scanner;
class MethodOverloading 
{
	public static void main(String[] args) 
	{
	menu();
	}
	static void menu()
		{
		Scanner scn=new Scanner(System.in);
		Multiplication m=new Multiplication();
		while(true)
			{
				System.out.println("menu");
				System.out.println("1.two numbers multiplication");
				System.out.println("2.three numbers multiplication");
				System.out.println("3.exit from the page");
				System.out.println("choose your choice");
                int choice=scn.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("enter first value");
						int a=scn.nextInt();
						System.out.println("enter second value");
						int b=scn.nextInt();
						m.mul(a,b);
					break;
					case 2:
						System.out.println("enter first value");
						int x=scn.nextInt();
						System.out.println("enter second value");
						int y=scn.nextInt();
						System.out.println("enter third value");
						int z=scn.nextInt();
						m.mul(x,y,z);
					break;
					case 3:
						System.out.println("exiting the program byee..!");
						System.exit(0);
					break;
					default:
						System.out.println("please choose valid chaice");
					break;
				}
			}
	}
}
class Multiplication
{
	public void mul(int a,int b)
	{
		int res=a*b;
		System.out.println("product of "+a+" and "+b+" is:"+res);
	}
	public void mul(int x,int y,int z)
	{
		int prod=x*y*z;
		System.out.println("product of"+x+","+y+" and "+z+"is:"+prod);
	}
}

import java.util.Scanner;
class Controlstructures 
{
	public static void main(String[] args) 
	{
	    menu();
	}
	static void menu()
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("menu");
			System.out.println("1.conditional statements");
			System.out.println("2.looping statements");
			System.out.println("3.jumping statements");
			System.out.println("4.exit from the page");
			System.out.println("select choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					conditional();
				break;
				case 2:
					looping();
				break;
				case 3:
					jumping();
				break;
				case 4:
					System.exit(0);
				break;
				default:
					System.out.println("enter valid input");
			}
		}
	}
	static void conditional()
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("conditional statements");
			System.out.println("1.if");
			System.out.println("2.if else");
			System.out.println("3.if else if");
			System.out.println("4.nesthed if");
			System.out.println("5.back to menu");
			System.out.println("select choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("if statement");
					System.out.println("enter a number");
					int age=s.nextInt();
					if(age>=18)
					{
						System.out.println("you are eligible for vote");
					}
					System.out.println("thank you");
				}
				break;
				case 2:
				{
					System.out.println("if else statement");
					System.out.println("enter a number");
					int age=s.nextInt();
					if(age>=18)
					{
						System.out.println("you are eligible for vote");
					}
					else
					{
					System.out.println("you are not eligible for vote");
					}
				}
				break;
				case 3:
				{
					System.out.println("if else if");
					System.out.println("enter a year");
					int month=s.nextInt();
					if(month==2)
						System.out.println("no.of days is 28");
					else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
						System.out.println("no.of days is 31");
					else if(month==4||month==6||month==9||month==11)
						System.out.println("no.of days is 30");
					else
						System.out.println("no.of days is 30");
				}
				break;
				case 4:
				{
					System.out.println("nesthed if");
					System.out.println("enter any three numbers");
					int a=s.nextInt();
					int b=s.nextInt();
					int c=s.nextInt();
					if(a>b)
				        {
						if(a>c)
							System.out.println(a+"is bigger");
						else
							System.out.println(c+"is bigger");
						}
					else if(b>c)
						System.out.println(b+"is bigger");
					else
						System.out.println(c+"is bigger");
				}
				break;
				case 5:
				    {
					System.out.println("back to menu");
					menu();
					}
				break;
				default:
					System.out.println("enter valid input");
			}
		}
	}
	static void looping()
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("looping statements");
			System.out.println("1.for");
			System.out.println("2.while");
			System.out.println("3.do while");
			System.out.println("4.for each");
			System.out.println("5.back to menu");
			System.out.println("select choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				
					System.out.println("for");
					System.out.println("enter a value to do Factorial");
					int f=s.nextInt();
					int fact=1;
					for(int i=1;i<=f;i++)
					{
						fact=fact*i;
					}
					System.out.println("Factorial of"+f+"!="+fact);
				
				break;
				case 2:
				{
					System.out.println("while");
					System.out.println("enter a number");
					int num=s.nextInt();
					while(num<=10)
					{
						if(num%2==0)
						{
							System.out.println(num);
						}
						num++;
					}
				}
				break;
				case 3:
				{
					System.out.println("do while");
					System.out.println("enter a number");
					int num=s.nextInt();
					int sum=0;
					do
					{
					while(num!=0)
						{
						int rem=num%10;
						sum+=rem;
						num/=10;
						}
						num=sum;
						sum=0;
					}
					while(num>9);
						System.out.println(num);
				}
				break;
				case 4:
				{
					System.out.println("for each");
					int[][]a={{1,2,3},{4,5,6},{7,8,9}};
					for(int[]t:a)
					{
						for(int n:t)
						{
							System.out.println(n+"\t");
						}
						System.out.println();
					}
				}
				break;
				case 5:
				{
					System.out.println("back to menu");
					menu();
				}
				break;
				default:
					System.out.println("enter valid input");
			}
		}
	}
	static void jumping()
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("jumping statements");
			System.out.println("1.break");
			System.out.println("2.continue");
			System.out.println("3.return");
			System.out.println("4.back to menu");
			System.out.println("select choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("break");
					for(int i=1;i<=5;i++)
					{
						if(i==3)
						break;
						System.out.println(i);
					}
				}
				break;
				case 2:
				{
					System.out.println("continue");
					for(int i=1;i<=5;i++)
					{
						if(i==3)
						continue;
						System.out.println(i);
					}
				}
				break;
				case 3:
					m1();
				break;
				case 4:
				{
					System.out.println("back to menu");
					menu();
				}
				break;
				default:
					System.out.println("enter valid input");
			}
		}
	}
	static void m1()
	{
		System.out.println("return statement");
					for(int i=1;i<=5;i++)
					{
						if(i==3)
						return;
						System.out.println(i);
					}
	}
}



			

						
					


			
		



				




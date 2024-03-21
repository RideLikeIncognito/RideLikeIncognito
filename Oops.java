import java.util.Scanner;
class Oops 
{
	public static void main(String[] args) 
	{
		menu();
	}
	static void menu()
		{
		Scanner obj=new Scanner(System.in);
		while(true)
			{
				System.out.println("menu");
				System.out.println("1.abstraction");
				System.out.println("2.encapsulation");
				System.out.println("3.polymorhipsm");
				System.out.println("4.inheritance");
				System.out.println("5.exit the program");
				System.out.println("choose your choice");
                int choice=obj.nextInt();
				switch(choice)
				{
					case 1:
						B b=new B();
						b.m1();
						b.m2();
						b.m3();
					break;
					case 2:
						Scanner sc=new Scanner(System.in);
						Factorial ft=new Factorial();
						System.out.println("enter a number");
						int n=sc.nextInt();
						ft.setNum(n);
						System.out.println(ft.getNum()+"!="+ft.fact());
					break;
					case 3:
						Scanner s=new Scanner(System.in);
						Add a=new Add();
						System.out.println("enter first number");
						int x=s.nextInt();
						System.out.println("enter second number");
						int y=s.nextInt();
						a.Sum(x,y);
						System.out.println("enter first number");
						int k=s.nextInt();
						System.out.println("enter second number");
						int l=s.nextInt();
						System.out.println("enter third number");
						int m=s.nextInt();
						a.Sum(k,l,m);
					break;
					case 4:
						D d=new D();
						d.m2();
					break;
					case 5:
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
abstract class A
{
	abstract void m1();
	public void m2()
	{
		System.out.println("m2() defined in class A");
	}
	public void m3()
	{
		System.out.println("m3() defined in class A");
	}
}
class B extends A
{
	@Override
		public void m1()
	{
		System.out.println("abstarct method m1()defined in class B");
	}
	public void m2()
	{
		System.out.println("defalut method m2() is defined in class B");
	}
}
class Factorial
{
	private int num;
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int fact()
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class Add
{
	public void Sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of "+a+" and "+b+" is:"+c);
	}
	public void Sum(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("sumof"+a+","+b+" and "+c+"is:"+sum);
	}
}
class C
{
	public void m1()
	{
		System.out.println("m1() defined oin class A");
	}
}
class D extends C
{
	public void m2()
	{
		m1();
		System.out.println("m2() defined in class B");
	}
}




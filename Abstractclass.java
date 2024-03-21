import java.util.Scanner;
public class Abstractclass
{
	public static void main(String[] args)
	{
		menu();
	}
	static void menu()
	{
		Scanner scn=new Scanner(System.in);
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Abstraction");
			System.out.println("2.Nested or Inner classes");
			System.out.println("3.Exit the program");
			System.out.println("choose your choice");
			int choice=scn.nextInt();
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
					Outer o=new Outer();
					Outer.Inner i=o.new Inner();
					System.out.println("enter the first num");
					int n1=sc.nextInt();
					System.out.println("enter the second num");
					int n2=sc.nextInt();
					System.out.println("enter the third num");
					int n3=sc.nextInt();
					o.sum(n1,n2);
					o.mul(n1,n2,n3);
					i.m1();
					break;
				case 3:
					System.out.println("exiting the program");
					System.exit(0);
					break;
				default:
					System.out.println("please choose valid choice");
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
		System.out.println("Abstract method m1() defined in class B");
	}
	public void m2()
	{
		System.out.println("default method m2() is defined in class B");
	}
}

class Outer
{
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of"+a+"and"+b+"is:"+c);
	}
	public void mul(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println("Mul of"+a+","+b+"and"+c+"is:"+mul);
	}
	class Inner
	{
		public void m1()
		{
			System.out.println("m1() is Inner of the program");
		}
	}
}



import java .util.Scanner;
public class StringFun
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
			System.out.println("string handling functions menu");
			System.out.println("1.charAt()");
			System.out.println("2.equals()");
			System.out.println("3.length()");
			System.out.println("4.toLowerCase()");
			System.out.println("5.toUpperCase()");
			System.out.println("6.indexOf()");
			System.out.println("7.substring()");
			System.out.println("8.trim()");
			System.out.println("9.concat()");
			System.out.println("10.exit from the program");
			System.out.println("select choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					String str="Hello";
					System.out.println("character at given position is:"+str.charAt(1));
				break;
				case 2:
					String s1="Java";
					String s2="Java";
					String s3="java";
					System.out.println("compare s1 and s2"+s1.equals(s2));
					System.out.println("compare s1 and s3"+s1.equals(s3));
				break;
				case 3:
						String s4="India";
						System.out.println(s4.length());
				break;
				case 4:
					String s5="MCA";
					System.out.println(s5.toLowerCase());
				break;
				case 5:
					String s6="good morning";
					System.out.println(s6.toUpperCase());
				break;
				case 6:
					String s7="college";
					System.out.println(s7.indexOf('g'));
				break;
				case 7:
					String s8="MOTHER THERESA";
					System.out.println(s8.substring(0,6));
					System.out.println(s8.substring(3));
				break;
				case 8:
					String s9="good morning";
					System.out.println(s9.trim());
				break;
				case 9:
					String str1="good";
					System.out.println(str1.concat("aftrenoon"));
				break;
				case 10:
					System.out.println("exit from the page");
				break;
				default:
					System.out.println("please enter valid option");
				break;
			}
		}
	}
}



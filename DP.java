import java.util.Scanner;
public class DP
{
	public static int tph,howhung,cho;
	public static int[] philname=new int[20],status=new int[20],hu=new int[20];
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		System.out.println("\nDINING PHILOSOPHER PROBLEM\n");
		System.out.println("\nEnter the total number of philosopher:");
		tph=sc.nextInt();
		for(int i=0;i<tph;i++)
		{
			philname[i]=i+1;
			status[i]=1;
		}
		System.out.println("how many are hungry");
		howhung=sc.nextInt();
		if(howhung==tph)
		{
			System.out.println("\nAll are hungry..\nDeadlock stage will occurs");
			System.out.println("Exiting");
		}
		else
		{
			for(int i=0;i<howhung;i++)
			{
				System.out.println("Enter philosopher"+(i+1)+"p");
				hu[i]=sc.nextInt();
				status[hu[i]]=2;
			}
			do
			{
				System.out.println("1.one can eat a time\t2.Two can eat at a time\t3.Exit\nEnter your choice:");
				cho=sc.nextInt();
				switch(cho)
				{
					case 1: 
						one();
						break;
					case 2:
						two();
						break;
					case 3:
						System.exit(0);
					default:
						System.out.println("1");
				}
			}
			while(true);
		}
	}
	public static int one()
	{
		int pos=0;
		System.out.print("\nAllow one philosopher to eat anytime\n");
		for(int i=0;i<howhung;i++,pos++)
		{
			System.out.println("\np is waiting"+philname[hu[pos]]+"is waiting");
		}
	return 0;
	}



public static int two()
{
	int s=0,t,r;
	System.out.println("\nAllow two philosophers to eat at same time \n");
	for(int i=0;i<howhung;i++)
	{
		for(int j=i+1;j<howhung;j++)
		{
			if(hu[i]-hu[j]>=1 && hu[i]-hu[j]!=4)
			{
				System.out.print("\n\n combination"+(s+1));
				t=hu[i];
				r=hu[j];
				s++;
				System.out.print("\np and are generated to eat"+philname[hu[i]]+"p"+philname[hu[j]]+"eat");
				for(int x=0;x<howhung;x++)
				{
					if(hu[x]!=t&&hu[x]!=r)
					{
						System.out.println("\np is waiting"+philname[hu[x]]+"i");
					}
				}
			}
		}
		
	}
	return 0;
}
}
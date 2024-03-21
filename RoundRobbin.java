import java.util.*;
import java.lang.*;
class RoundRobin
	{
	Scanner sc=new Scanner(System.in);
	int[] bur,rem,wai,ta;
	int size,q,b=0,t=0,flag=0;
	RoundRobin(int size)
		{
		this.size=size;
		bur=new int[size];
		wai=new int[size];
		ta=new int[size];
		rem=new int[size];
	}
	void get()
	{
	for (int i=0;i<size ;i++)  
	{
	System.out.println("Burst Time for p"+(i+1)+"i");
	bur[i]=rem[i]=sc.nextInt();
	}
	System.out.println("Enter Quantum Time");
	q=sc.nextInt();
	}
	void round()
	{
		do
		{
			flag=0;
			for(int i=0;i<size;i++)
				{
				if(rem[i]>=q)
					{
					System.out.println("P"+(i+1)+">-");
					for (int j=0;j<size ;j++ )
						{
						if(j==i)
						rem[i]=0;
						else if(rem[j]>0)
						wai[j]+=q;
				}
			}
			else if(rem[i]>0){
				System.out.println("p"+(i+1)+"\t");
				for (int j=0;j<size ;j++ )
					if(j==i)
						rem[i]=0;
					else if(rem[j]>0)
						wai[j]+=rem[i];
				}
			}
for(int i=0;i<size;i++)
	if(rem[i]>0)
	flag=1;
		}
		while(flag==1);
			for(int i=0;i<size;i++)
			ta[i]=wai[i]+bur[i];
	}
	void display(){
		System.out.println("\n Process \tBurst\t waiting\t Turnaround");
		for(int i=0;i<size;i++){

		System.out.println("\t p"+(i+1)+"\t"+bur[i]+"\t"+wai[i]+"\t"+ta[i]);
		b+=wai[i];
		t+=ta[i];
		}
		System.out.println("Average waiting time:"+(b/size));
		System.out.println("Average turn around time:"+(t/size));
		}
	}
	class Kroundrobin{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of Process");
	int n=sc.nextInt();
	RoundRobin obj=new RoundRobin(4);
	obj.get();
	obj.round();
	obj.display();
		}
	}
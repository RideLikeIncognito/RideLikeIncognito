import java.util.*;
import java.lang.*;
class Fcfs
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p;
		float t1=0,t2=0;
		System.out.println("Enter no.of Processros ");
		p=sc.nextInt();
		int bt[]=new int[p];
		
		System.out.println("Enter burst time");
		for (int i=0;i<p ;i++ )
		{
		System.out.println("Burst Time for p"+(i+1)+"=");
		bt[i]=sc.nextInt();
		}
		int wt[]=new int[p];
		 wt[0]=0;
		for (int i=1;i<p ;i++ )
		{
		wt[i]=bt[i-1]+wt[i-1];
		t1+=wt[i];
		}
		int tat[]=new int[p];
		for(int i=0;i<p ;i++ )
		{
		tat[i]=bt[i]+wt[i];
		t2+=tat[i];
		}
		System.out.println("Process\t Burst Time\t Waiting Time\t Turn Around Time");
		for(int i=0;i<p;i++){
			System.out.println("p"+(i+1)+"\t\t"+bt[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);}
			float awt,att;
			System.out.println("Average waiting time = "+t1/p +"ms");
			System.out.println("Average turn around time = "+t2/p +"ms");
	}
}

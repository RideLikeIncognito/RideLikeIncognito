import java.util.*;
import java.lang.*;
class Sjs
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p,temp,i,j,order[];
		float t1=0,t2=0;
		System.out.println("Enter no.of Processros ");
		p=sc.nextInt();
		int bt[]=new int[p];
		order = new int[p];
		System.out.println("Enter burst time");
		for ( i=0;i<p ;i++ )
		{
			order[i]=i+1;
			    bt[i]=sc.nextInt();
		}
		for ( i=0;i<p ;i++ )
		{
			for ( j=i+1;j<p ;j++ ){
				if (bt[i]>bt[j]){
					temp=bt[i];
					bt[i]=bt[j];
					bt[j]=temp;
					temp=order[i];
					order[i]=order[j];
					order[j]=temp;
		}	}	}
		int wt[]=new int[p];
		wt[0]=0;
		for ( i=1;i<p ;i++ ){
			wt[i]=bt[i-1]+wt[i-1];
			t1+=wt[i];
		}
		int tat[]=new int[p];
		for( i=0;i<p ;i++ )
		{
		tat[i]=bt[i]+wt[i];
		t2+=tat[i];
		}
		System.out.println("Process\t Burst Time\t Waiting Time\t Turn Around Time");
		for( i=0;i<p;i++){
			System.out.println("p"+order[i]+"\t\t"+bt[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);}
			float awt,att;
			System.out.println("Average waiting time = "+t1/p +"ms");
			System.out.println("Average turn around time = "+t2/p +"ms");
	}
}
	


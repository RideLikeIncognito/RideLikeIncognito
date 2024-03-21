import java.util.*;
public class Bankers
	{
private int need[][], allocate[][], max[][], avail[][], nr, np;
private void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.of Processros and Resources ");
	np=sc.nextInt();
	nr=sc.nextInt();
	need=new int[np][nr];
	max=new int[np][nr];
	allocate=new int[np][nr];
	avail=new int[1][nr];
	System.out.println("Enter Allocation Matrix ");
	for (int i=0;i<np ;i++)  
		for(int j=0;j<nr ;j++)
			allocate[i][j]=sc.nextInt();
	System.out.println("Enter Max Matrix ");
	for(int i=0;i<np ;i++)
	for(int j=0;j<nr ;j++)
	max[i][j]=sc.nextInt();
	System.out.println("Enter Avail Matrix ");
	for(int j=0;j<nr ;j++ )
		avail[0][j]=sc.nextInt();
	sc.close();
	}
						
	private int[][] calc_need()
	{
	for(int i=0;i<np ;i++ )
	for(int j=0;j<nr;j++ )
		need[i][j]=max[i][j]-allocate[i][j];
		return need;
	}
private boolean check(int i)
{
for(int j=0;j<nr ;j++ )
	if(avail[0][j]<need[i][j])
	return false;
	return true;
	}
	public void isSafe()
	{
		input();
		calc_need();
		boolean done[]=new boolean[np];
		int j=0;
		while(j<np){
			boolean allocate=false;
				for(int i=0; i<np;i++ )
					if(!done[i]&&check(i)){
					for (int k=0;k<nr;k++)
					avail[0][k]=avail[0][k]-need[i][k]+max[i][k];
										
					System.out.println("Allocated Processros: "+i);
					allocate = done[i]=true;
					j++;
					}
	if(! allocate)break;
						}
				if (j==np)
												
System.out.println("\n Safley allocated");
	else
	System.out.println("All Process can't be allocated safly");		
	}
	public static void main(String[] args) {
		new Bankers().isSafe();
	}
	}
										
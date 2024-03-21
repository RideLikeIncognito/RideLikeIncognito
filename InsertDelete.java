import java.util.Scanner;
class InsertDelete
{
public static void main(String[] args)
{
menu();
}
static void menu()
{
Scanner sc=new Scanner(System.in); 
while(true)
{
System.out.println("1.Insertion");
System.out.println("2.Deletion");
System.out.println("3.exit");
System.out.println("select any option");
int choice=sc.nextInt();
switch(choice)
{
case 1:
int len,pos,e,i;
Scanner s=new Scanner(System.in);
System.out.println("enter number of elements in an array");
len=s.nextInt();
int arr[]=new int[len+1];
System.out.println("enter elements of an arry");
for(i=0;i<len; i++)
{
arr[i]=s.nextInt();
}
System.out.println("enter position where to insert an element");
pos=s.nextInt();
System.out.println("enter element to be inserted");
e=s.nextInt();
for(i=len-1;i>=(pos-1);i--)
{
arr[i+1]=arr[i];
}
arr[pos-1]=e;
System.out.println("after inserting array elements are:");
for(i=0;i<len;i++)
{
System.out.println(arr[i]+" ");
}
break;

case 2:
int len1,pos1,e1,i1;
Scanner s1=new Scanner(System.in);
System.out.println("enter number of elements in an array");
len1=s1.nextInt();
int arr1[]=new int[len1];
System.out.println("enter elements of an arry"); 
for(i1=0;i1<len1;i1++)
{
arr1[i1]=s1.nextInt();
}
System.out.println("enter element to be deleted");
e1=s1.nextInt();
for(i1=0;i1<len1-1;i1++)
{
if(arr1[i1]==e1)
{
for(int j=i1;j<(len1-1);j++)
{
arr1[j]=arr1[j+1];
}
break;
}
} 
System.out.println("after deleting array elements are:"); 
for(i1=0;i1<(len1-1);i1++)
{
System.out.println(arr1[i1]);
}
break;

case 3:
System.out.println("exiting the program");
System.exit(0);
break;

default:
System.out.println("Invalid choice");
break;
}
}
}
}
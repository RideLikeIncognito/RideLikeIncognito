import Mypack1.Demo111;
import Mypack1.*;
interface Sum
{
public void sum(int a,int b);
}
interface Mul
{
public void mult(int a,int b,int c);
}
interface Divi extends Sum,Mul
{
public void divi1(int a,int b);
}
class Demo24 implements Divi
{
public void sum(int a,int b)
{
int c = a+b;
System.out.println("Sum of "+a+" and "+b+" is: "+c);
}
public void mult(int a,int b,int c)
{
int mul=a*b*c;
System.out.println("mul"+a+","+b+"and"+c+"is:"+mul);
}
public void divi1(int a,int b)
{
int div=a%b;
System.out.println("divi"+a+","+b+" is:"+div);
}
public static void main(String[] args)
{
Demo111 d1=new Demo111();
d1.one();
Demo24 s=new Demo24();
s.sum(2,3);
s.mult(2,3,4);
s.divi1(2,4);
}
}
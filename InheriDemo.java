import java.util.Scanner;
public class InheriDemo {
 public static void main(String[] args) {
 menu();
 }
 
 static void menu() {
 Scanner scn = new Scanner(System.in);
 while(true) {
	System.out.println("Menu: ");
	System.out.println("1.single inheritance");
	System.out.println("2.multilevel inheritance");
	System.out.println("3.multiple(interface)");
	System.out.println("4.Hierarchical inheritance");
	System.out.println("5.hybrid inheritance");
	System.out.println("6.Exit the menu");
	System.out.println("Choose Your Choice");
 
	int choice = scn.nextInt();
	switch(choice) {
		case 1:
			B b = new B();
			b.m1();
			b.m2();
			b.m3();
			b.m4();
			break;
		case 2:
		    Three t=new Three();
			t.volume();
			t.display();
			Two t1=new Two();
			t1.display();
			t1.print();
			break;
		case 3:
			Scanner s1=new Scanner(System.in);
			System.out.println("enter the first num");
			int n1=s1.nextInt();
			System.out.println(" enter the Second num");
			int n2=s1.nextInt();
			System.out.println("enter the third num");
			int n3=s1.nextInt();
			Sub w=new Sub();
			w.sum(n1,n2);
			w.mult(n1,n2,n3);
			w.divi1(n1,n2);
			break;
		case 4:
			D d = new D();
			d.m2();
			E e=new E();
			e.m3();
			break;
		case 5:
			Earth e1=new Earth();
			e1.double1();
			Mars r1=new Mars();
			r1.triple();
			break;
		case 6:
			System.out.println("Exiting The Program Byee...!");
			System.exit(0);
			break;
		default:
			System.out.println("Please Choose Valid Choice");
			break;
			}
		}
	}
}
// single inheritance
class A {
	public void m1() {
	System.out.println("m1() defined in class A");
 }
 public void m2() {
 System.out.println("m2() defined in class A");
 }
}
class B extends A {
	public void m3() {
	System.out.println("m3() defined in class B");
 }
 public void m4() {
 System.out.println("m4() is defined in class B");
 }
}
// multilevel inheritance
class One {
	public void print() {
	System.out.println("I am the parent class");
 }
}
class Two extends One {
 public void display() {
 System.out.println("I am the sub class of the one class");
 }
}
class Three extends Two {
	public void volume() {
	System.out.println("I am the sub class of the Two class");
 }
}
// multiple inheritance
interface Sum {
 public void sum(int a,int b);
}
interface Mul {
 public void mult(int a,int b,int c);
}
interface Divi extends Sum,Mul {
 public void divi1(int a,int b);
}
class Sub implements Divi {
	public void sum(int a,int b) {
	int c = a+b;
	System.out.println("Sum of "+a+" and "+b+" is: "+c);
 }
 public void mult(int a,int b,int c) {
 int mul=a*b*c;
 System.out.println("mul"+a+","+b+"and"+c+"is:"+mul);
 }
 public void divi1(int a,int b) {
 int div=a%b;
 System.out.println("divi"+a+","+b+" is:"+div);
 }
}
// hierarchical inheritance
class C {
	public void m1() {
	System.out.println("m1() defined in class c");
 }
}
class D extends C {
	public void m2() {
	m1();
	System.out.println("m2() defined in class D");
 }
}
class E extends C {
	public void m3() {
	m1();
	System.out.println("m3() defines in class E");
 }
}
// hybrid inheritance
class SolarSystem {
	public void single() {
	System.out.println("I am the Solar class method");
 }
}
class Earth extends SolarSystem {
	public void double1() {
	System.out.println("I am the Earth class method");
 }
}
class Mars extends SolarSystem {
	public void triple() {
	System.out.println("I am the Mars class method");
 }
}
class Moon extends Earth {
	public void forth() {
	System.out.println("I am the Moon class method");
 }
}
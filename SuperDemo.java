import java.util.Scanner;
public class SuperDemo {
 public static void main(String[] args) {
 menu();
 }
 
 static void menu() {
 Scanner scn = new Scanner(System.in);
 while(true) {
 System.out.println("Menu: ");
 System.out.println("1.Super keyword");
 System.out.println("2.this keyword");
 System.out.println("3.Final keyword");
 System.out.println("4.Exit The Program");
 System.out.println("Choose Your Choice");
 int choice = scn.nextInt();
 switch(choice) {
 case 1:
 B b = new B();
 b.display();
 b.show();
 break;
 case 2:
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the num");
 int n1 = s.nextInt();
 ThisDemo td = new ThisDemo();
 td.m2();
 td.setValues(n1);
 td.display();
 break;
 case 3:
 FinalDemo fd = new FinalDemo();
 break;
 case 4:
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
class A {
 int i = 10;
 
 public void m1() {
 System.out.println("I am in class A1");
 }
 
 A() {
 System.out.println("I am in class A2");
 }
}
class B extends A {
 int i = 20;
 
 public void show() {
 System.out.println(super.i);
 }
 
 public void m1() {
 System.out.println("I am in class B1");
 }
 
 public void display() {
 m1();
 super.m1();
 System.out.println("I am in display method in B1"); 
 }
 
 B() {
 super();
 System.out.println("I am in class B2"); 
 }
}
class ThisDemo {
 int i;
 
 void setValues(int i) {
 this.i = i;
 }
 
 void show() {
 System.out.println(i);
 }
 
 void display() {
 this.show();
 System.out.println("Welcome to the ThisDemo class");
 }
 
 ThisDemo() {
 this(10);
 System.out.println("No argument constructor");
 }
 
 ThisDemo(int a) {
 System.out.println("Parameterized constructor");
 }
 
 void m1(ThisDemo td) {
 System.out.println("I am in m1 method");
 }
 
 void m2() {
 m1(this);
 }
}
class FinalDemo {
 final int speed;
 
 FinalDemo() {
 speed = 70;
 System.out.println(speed);
 }
}
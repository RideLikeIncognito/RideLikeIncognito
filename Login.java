import java.awt.*;
class Login extends Frame
{
	TextField t1,t2;
	Label l1,l2;
	Button b1,b2;
	public Login()
	{
		Frame f=new Frame("Login Form");
		t1=new TextField();
		t2=new TextField();

		l1=new Label("UserName");
		l2=new Label("Password");

		b1=new Button("Sign In");
		b2=new Button("Sign Out");

		l1.setBounds(30,100,100,50);
		t1.setBounds(140,160,150,50);

		l2.setBounds(30,160,100,50);
		t2.setBounds(140,100,150,50);

		b1.setBounds(100,300,100,50);
		b2.setBounds(200,300,100,50);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);

		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.YELLOW);
	}
	public static void main(String[] args)
	{
		new Login();
	}
}

/*<applet code="Login.class"width="800"height="500">
</applet>
*/

import java.lang.String;
import java.sql.*;
class Oraclecon 
{
	public static void main(String[] args) 
	{
		try
		{
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcab2396","mtcab2396");
				Statement stmt=con.createStatement();
				stmt.execute("create table stu24(roll number(3),name varchar(20),marks number(3))");
				System.out.println("table created successfully");
				stmt.executeUpdate("insert into stu24 values(1,'shanmukha sai',85)");
				System.out.println("one record inserted successfuly");
			}

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}   
	
	

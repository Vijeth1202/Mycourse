import java.util.*;
import java.sql.*;
public class DynamicInputs {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
		
		Statement statement = null;
		Connection connection=null;
		
		
	
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			String url="jdbc:mysql://localhost:3306/viju";
			String user="root";
			String pass="Viju!123*";
			connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Database Connected Sucessfully");
			
			statement=connection.createStatement();
			System.out.println("Statement Object created Sucessfully");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the eid :");
			int eid=sc.nextInt();
			
			System.out.print("Enter the ename of employee:");
			String ename=sc.next();
			
			System.out.print("Enter the age of employee:");
			int age=sc.nextInt();
			
			System.out.print("Enter the salary of the employee:");
			int salary=sc.nextInt();
			
			System.out.print("Enter the address of emplyee:");
			String address=sc.next();
			
			String dynamicQuery=String.format("insert into employee values('%d','%s','%d','%d','%s')",eid,ename,age,salary,address);
			int rowsAffected=statement.executeUpdate(dynamicQuery);
			
			System.out.println("Number of rows affected ::"+rowsAffected);
			
		
		connection.close();
		statement.close();
		
	}

}

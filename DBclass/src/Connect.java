import java.sql.DriverManager;
import java.sql.*;
public class Connect {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet = null;
		
		
		try
		{
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			//Establish the connection
			String url="jdbc:mysql://localhost:3306/viju";
			String user="root";
			String pass="Viju!123*";
			connection =DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established Successfully..");
			System.out.println();
			System.out.println("The implementation class name is.."+connection.getClass().getName());

			//Create  statement and send the query
			String sqlquery1="select * from employee";
			statement = connection.createStatement();
			resultSet= statement.executeQuery(sqlquery1);
			System.out.println("The implementation class name is.."+statement.getClass().getName());
			System.out.println("The implementation class name is.."+resultSet.getClass().getName());
			System.out.println();
			
			System.out.println("eid\tename\tage\tsalary\taddress");
			//Process the resultset
			while(resultSet.next())
			{
				Integer eid=resultSet.getInt(1);
				String ename=resultSet.getString(2);
				Integer age=resultSet.getInt(3);
				Integer salary=resultSet.getInt(4);
				String address=resultSet.getString(5);

				System.out.println(eid+"\t"+ename+"\t"+age+"\t"+salary+"\t"+address);
				
				
			}
			
			
			
		//Handle the Exceptions	
			
		}
		catch(ClassNotFoundException ce)		
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Close the resources
		finally
		{
			if(connection!=null)
			{
				try{
					connection.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				
			}
		}
	}

}

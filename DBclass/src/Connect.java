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
			String pass="*****";
			connection =DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established Successfully..");
			System.out.println("The implementation class name is.."+connection.getClass().getName());

			//Create  statement and send the query
			String sqlQuery="select * from employee";
			statement = connection.createStatement();
			resultSet= statement.executeQuery(sqlQuery);
			
			System.out.println("eid\tename\tage\tsalary\taddress");
			
			while(resultSet.next())
			{
				Integer eid=resultSet.getInt(1);
				String ename=resultSet.getString(2);
				Integer age=resultSet.getInt(3);
				Integer salary=resultSet.getInt(4);
				String address=resultSet.getString(5);

				System.out.println(eid+"\t"+ename+"\t"+age+"\t"+salary+"\t"+address);
				
				
			}
			
			
			
			
			
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

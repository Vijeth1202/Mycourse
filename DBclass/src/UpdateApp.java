import java.sql.*;

public class UpdateApp {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
			Connection connection=null;
			Statement statement=null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			String url="jdbc:mysql:///viju";
			String user="root";
			String pass="Viju!123*";
			connection=DriverManager.getConnection(url, user, pass);
			
			statement=connection.createStatement();
			System.out.println("Statement object Created Successfully");
			
			String query="update employee set eid=1 where ename='Akash'";
			int rowsAffected=statement.executeUpdate(query);
			
			System.out.println("Number of Rows Affected ::"+rowsAffected);
			connection.close();
			statement.close();
			
	}

}

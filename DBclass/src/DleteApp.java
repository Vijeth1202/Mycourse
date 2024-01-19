import java.sql.*;
public class DleteApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
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

			
			String deleteQuery="Delete from employee where eid=8";
			int rowsAffected=statement.executeUpdate(deleteQuery);
			
			System.out.println("Number of rows affected ::"+rowsAffected);
			
		
		connection.close();
		statement.close();
		
		
		

	}

}

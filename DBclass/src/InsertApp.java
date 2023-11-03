import java.sql.*;

public class InsertApp {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		Connection connection=null;	
		Statement statement=null;
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Successfully");
		
		String url="jdbc:mysql:///viju";
		String user="root";
		String pass="Viju!123*";
		connection = DriverManager.getConnection(url,user,pass);
		System.out.println("Connected to Database Successfully");
		
		statement = connection.createStatement();
		System.out.println("Stsement object created successfully");
		
		String sqlQuery="insert into employee values(5,'Karthik',25,65000,'Bidar')";
		int rowsAffected=statement.executeUpdate(sqlQuery);
		
		System.out.println("Number of rows Affected ::"+rowsAffected);
		
		connection.close();
		statement.close();
	}

}

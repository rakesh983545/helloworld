package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {
		
		try {
			getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static Connection getConnection() throws Exception{
		
		try {
			String driver ="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/Database";
			String username="root";
			String password="123456";
			Class.forName(driver);
			
			Connection conn=DriverManager.getConnection(url, username, password);
			System.out.println("connected online");
			return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}

}

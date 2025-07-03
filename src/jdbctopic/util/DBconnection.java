package jdbctopic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static final String URLNAME = "jdbc:mysql://localhost:3306/fulldaydb"; 
	public static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";          
	public static final String USERNAME = "root";                                 
	public static final String PASSWORD = "Meet$8374";                            
	                                                                              
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(URLNAME,USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("DB--connected: "+conn);
			}else {
				System.out.println("DB not connected: "+conn);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		
		Connection conn = DBconnection.getConnection();
		
		System.out.println("conn: "+conn);
		
		
	}

}

package project.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project.jdbc.bean.EmployeeBean;
import project.jdbc.util.DBConnection;

public class EmployeeDao {
	
	public static int insertEmployee(EmployeeBean emp) {
		
		String insertQuery = "insert into employee (name, department, designation, salary) values (?,?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowAffected = 0;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1, emp.getName());
				pstmt.setString(2, emp.getDepartment());
				pstmt.setString(3, emp.getDesignation());
				pstmt.setDouble(4, emp.getSalary());
				
				rowAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("EmployeeDao-- insertEmployee(EmployeeBean emp)--DB connection failed ");
		}
		
		return rowAffected;
	}

}

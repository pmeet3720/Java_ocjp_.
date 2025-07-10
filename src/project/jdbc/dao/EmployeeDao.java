package project.jdbc.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public static int deleteEmployeeByEmpID(int emp_id) {
		
		int rowAffected = 0;
		
		String deleteQuery = "delete from employee where emp_id = ?";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1, emp_id);
				
				rowAffected = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowAffected;
	}
	
	public static int updateEmployeeByEmpID(EmployeeBean emp, int emp_id) {
		int rowAffected = 0;
		
		String updateQuery = "update employee set name = ?, department = ?, designation = ?, salary = ? where emp_id = ?";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, emp.getName());
				pstmt.setString(2, emp.getDepartment());
				pstmt.setString(3, emp.getDesignation());
				pstmt.setDouble(4, emp.getSalary());
				pstmt.setInt(5, emp_id);
				
				rowAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowAffected;
	}
	
	public static EmployeeBean getEmployeeByEmpID(int emp_id) {
		String searchQuery = "select * from employee where emp_id = ?";
		
		Connection conn = DBConnection.getConnection();
		
		EmployeeBean emp = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		if(conn!=null) {
			try {
				pstmt = conn.prepareStatement(searchQuery);
				
				pstmt.setInt(1, emp_id);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					emp = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
				}
				return emp;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static EmployeeBean getEmployeeByEmpName(String empName) {
		String searchQuery = "select * from employee where name = ?";
		
		Connection conn = DBConnection.getConnection();
		
		EmployeeBean emp = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		if(conn!=null) {
			try {
				pstmt = conn.prepareStatement(searchQuery);
				
				pstmt.setString(1, empName);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					emp = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
				}
				return emp;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static ArrayList<EmployeeBean> getEmployeeRecords() {
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		
		String selectQuery = "select * from employee";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(selectQuery);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int emp_id = rs.getInt(1);
					String name = rs.getString(2);
					String department = rs.getString(3);
					String designation = rs.getString(4);
					double salary = rs.getDouble(5);
					EmployeeBean emp = new EmployeeBean(emp_id,name,department,designation,salary);
					
					list.add(emp);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
		
	}

}

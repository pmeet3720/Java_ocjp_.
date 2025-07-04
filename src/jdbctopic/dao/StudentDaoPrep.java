package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBconnection;

public class StudentDaoPrep {
	
	public int insertStudent(StudentBean s) {
		String insertQuery = "insert into student (name,std,marks) values (?,?,?)";
		
		Connection conn = DBconnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowAffected = 0;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				
				rowAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDaoPrep--insertStudent(StudentBean s)--DB not connected");
		}
		return rowAffected;
		
	}
	
	public int deleteStudent(int rno) {
		String deleteQuery = "delete from student where rno = ?";
		
		Connection conn  = DBconnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowAffected = 0;
		
		if(conn != null) {
			
			try {
				pstmt = conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1,rno);
				
				rowAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("StduentDaoPrep--deleteStudent(int rno)--DB not connected");
		}
		return rowAffected;
		
	}
	
	public int updateStudent(StudentBean s, int rno) {
		
		String updateQuery = "update student set name = ?, std = ?, marks = ?";
		
		Connection conn = DBconnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowAffected = 0;
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setInt(1, rno);
				pstmt.setString(2, s.getName());
				pstmt.setInt(3, s.getStd());
				pstmt.setInt(4, s.getMarks());
				
				rowAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDaoPrep--updateStudent(StudentBean s, int rno)--DB not connected");
		}
		return rowAffected;
	}
	
	public ArrayList<StudentBean> getAllRecords() {
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "Select * from student";
		
		Connection conn = DBconnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		if(conn != null) {
			try {
				pstmt = conn.prepareStatement(selectQuery);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					StudentBean sbean = new StudentBean(rs.getInt(1),rs.getInt(3),rs.getInt(4),rs.getString(2));
					list.add(sbean);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		StudentDao studentdao = new StudentDao();
		
		System.out.println("enter rno to update student record: ");
		int rno = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter std: ");
		int std = sc.nextInt();
		
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		
		StudentBean s = new StudentBean(0,std,marks,name);
		
		int rowAffected = studentdao.updateStudent(s, rno);
		
		if(rowAffected > 0) {
			System.out.println("Student record updated successfully: "+rowAffected);
		}else {
			System.out.println("Student record not updated. "+rowAffected);
		}
		
		
//-----------------------------------------------------------------------------		
//		ArrayList<StudentBean> list = studentdao.getStudentRecords();
//		
//		for (int i = 0; i < list.size(); i++) {
//			StudentBean s = list.get(i);
//			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
//			
//		}
		
//------------------------------------------------------------------------------		
		
//		System.out.println("enter rno to delete student: ");
//		int rno = sc.nextInt();
//		
//		int rowAffected = studentdao.deleteStudent(rno);
//		if(rowAffected  > 0) {
//			System.out.println("Student record successfully deleted: "+rowAffected);
//		}else {
//			System.out.println("Student record not deleted."+rowAffected);
//		}
		
		
//--------------------------------------------------------------------------------
//		StudentBean s = new StudentBean(0,12,89,"Jethalal");
//		
//		int rowAffected = studentdao.insertStudent(s);
//		
//		if(rowAffected > 0) {
//			System.out.println("Student record successfully inserted "+rowAffected);
//		}else {
//			System.out.println("Student record not inserted. "+rowAffected);
//		}
		
	}

}

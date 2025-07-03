package jdbctopic.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBconnection;

public class StudentDao {
	
	public int insertStudent(StudentBean s) {
		Statement stmt = null;
		
		int rowAffected = 0;
		
		String insertQuery = "insert into student (name, std, marks) values ('"+s.getName()+"',"+s.getStd()+","+s.getMarks()+")";
		
		Connection conn = DBconnection.getConnection();
		
		if(conn != null) {
			try {
				stmt = conn.createStatement();
				
				rowAffected =  stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowAffected;
	}
	
	public int deleteStudent(int rno) {
		String deleteQuery = "delete from student where rno="+rno;
		Connection conn = DBconnection.getConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if(conn != null) {
			try {
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowAffected;
	}
	
	public int updateStudent(StudentBean s, int rno) {
		String updateQuery = "update student set name = '"+s.getName()+"', std = "+s.getStd()+", marks = "+s.getMarks()+" where rno = "+rno;
		Connection conn = DBconnection.getConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if(conn != null) {
			try {
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("DBConnection failed.");
		}
		return rowAffected;
	}
	
	public ArrayList<StudentBean> getStudentRecords(){
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "select * from student";
		
		Connection conn = DBconnection.getConnection();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		if(conn != null) {
			try {
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) {
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					StudentBean sbean = new StudentBean(rno,std,marks,name);
					list.add(sbean);
				}
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao--getStudentRecords()--DBConnection failed");
		}
		
		return list;
	}
	
	public StudentBean getStudentByRno(ArrayList<StudentBean> list,int rno) {
		StudentBean sbean = null;
		for (int i = 0; i < list.size(); i++) {
			sbean = list.get(i);
			if(sbean.getRno() == rno) {
				return sbean;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDao studentdao = new StudentDao();
		int rowAffected = 0,choice = 0;
		int rno,std,marks;
		String name;
		
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		do {
			System.out.println("1) Insert student");
			System.out.println("2) Delete student by rno");
			System.out.println("3) Update student by rno");
			System.out.println("4) Search student by rno");
			System.out.println("5) Display student records");
			System.out.println("6) Exit");
			
			System.out.println("enter choice: ");
			choice = sc.nextInt();
			
			StudentBean s = new StudentBean();
			
			switch (choice) {
			case 1:
				    sc.nextLine();
					System.out.println("Enter name: ");
					name = sc.nextLine();
					
					System.out.println("Enter std: ");
					std = sc.nextInt();
					
					System.out.println("Enter marks: ");
					marks = sc.nextInt();
					
					s = new StudentBean(0,std,marks,name);
					
					rowAffected = studentdao.insertStudent(s);
					
					if(rowAffected > 0) {
						System.out.println("Student record inserted successfully "+rowAffected);
					}else {
						System.out.println("Student record not inserted. "+rowAffected);
					}
				
				    break;
				    
			case 2:
					System.out.println("Enter rno to delete student: ");
					rno = sc.nextInt();
					
				    rowAffected = studentdao.deleteStudent(rno);
					
					if(rowAffected > 0) {
						System.out.println("Student record successfully deleted "+rowAffected);
					}else {
						System.out.println("Student record not deleted.");
					}
				
			        break;
			        
			case 3:
				
					System.out.println("Enter rno to update student: ");
					rno = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter name: ");
					name = sc.nextLine();
					
					System.out.println("Enter std: ");
					std = sc.nextInt();
					
					System.out.println("Enter marks: ");
					marks = sc.nextInt();
					
					s = new StudentBean(0,std,marks,name);
					rowAffected = studentdao.updateStudent(s,rno);
					
					if(rowAffected > 0) {
						System.out.println("Student record successfully updated "+rowAffected);
					}else {
						System.out.println("Student record not updated.");
					}
				
			        break;
			        
			case 4:
				    System.out.println("Enter rno to search student record: ");
				    rno = sc.nextInt();
				
				    s = studentdao.getStudentByRno(list,rno);
				    
				    if(s != null) {
				    	System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
				    }else {
				    	System.out.println("Student record not found in database");
				    }
					
				
			        break;
			        
			case 5:
				
					list = studentdao.getStudentRecords();
					
					for (int i = 0; i < list.size(); i++) {
						s = list.get(i);
						System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
						
					}
				
			        break;
			        
			case 6:
				    System.exit(0);
				    
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			        
				    break;
		
			}
		}while(choice!=6);
		
	}

}

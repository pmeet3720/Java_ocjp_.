package iotopic.byteorientedway.serializabletopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployeeMultipleReadApp2 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\EmployeeRecords.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Employee[] e = (Employee[])oin.readObject();
			
			System.out.println("Employee Data of: "+e[0].getOrg_name());
			
			for(int i=0;i<3;i++) {
				System.out.println("Emp_ID: "+e[i].getEmp_Id()+"\tEmp_Name: "+e[i].getEmp_name()+"\tSalary: "+e[i].getSalary()+"\tDesignation: "+e[i].getDesg()+"\tLocation: "+e[i].getLocation());
			}
			
			oin.close();
			fin.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

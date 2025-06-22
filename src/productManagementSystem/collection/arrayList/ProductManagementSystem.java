package productManagementSystem.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementSystem {
	
	public static Product getProductByProdID(ArrayList<Product> list, int searchProdId) {
		Product p;
		
		for(int i=0;i<list.size();i++) {
			p = list.get(i);
			if(searchProdId == p.getProdId()) {
				return p;
			}
		}
		
		return null;
	}
	
	public static Product getProductByProdName(ArrayList<Product> list, String searchProdName) {
		Product p;
		
		for(int i=0;i<list.size();i++) {
			p = list.get(i);
			if(p.getName().equalsIgnoreCase(searchProdName)) {
				return p;
			}
		}
		
		return null;
	}
	
	public static Integer getProductIndexByProdID(ArrayList<Product> list, int searchProdId) {
		Product p;
		
		for(int i=0;i<list.size();i++) {
			p = list.get(i);
			if(searchProdId == p.getProdId()) {
				return i;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		int choice=0, prodId;
		String prodName;
		Integer index;
		
		
		do {
			System.out.println("1) Insert product");
			System.out.println("2) Update product details using prodID");
			System.out.println("3) Delete product from records using prodID");
			System.out.println("4) Search product using prodID");
			System.out.println("5) Search product using prodName");
			System.out.println("6) Display products");
			System.out.println("7) Exit");
			
			System.out.println("enter choice: ");
			choice = sc.nextInt();
			
			Product p = new Product();
			
			switch (choice) {
			case 1:
				   p.scanData();
				   list.add(p);
				   System.out.println("Product inserted successfully.");
				   break;
				   
			case 2:
				
				   System.out.println("enter prodId to update: ");
				   prodId = sc.nextInt();
				   index = getProductIndexByProdID(list,prodId);
				   
				   if(index != null) {
					   p = list.get(index);
					   p.updateData();
					   list.set(index, p);
					   System.out.println("Product data updated successfully.");
				   }else {
					   System.out.println("Product not found in records.");
				   }
				   break;
				   
			case 3:
				 
				   System.out.println("enter prodId to update: ");
				   prodId = sc.nextInt();
				   index = getProductIndexByProdID(list,prodId);
				   
				   if(index != null) {
					   p = list.get(index);
					   list.remove(p);
					   System.out.println("Product deleted successfully from records.");
				   }else {
					   System.out.println("Product not found in records.");
				   }
				   break;
				   
			case 4:
				   
				   System.out.println("enter prodId to update: ");
				   prodId = sc.nextInt();
				   p = getProductByProdID(list,prodId);
				   
				   if(p != null) {
					   System.out.println("Product found.");
					   p.dispData();
				   }else {
					   System.out.println("Product not found.");
				   }
				   break;
				   
			case 5:
				   
				   System.out.println("enter prodName to update: ");
				   sc.nextLine();
				   prodName = sc.nextLine();
				   p = getProductByProdName(list,prodName);
				   
				   if(p != null) {
					   System.out.println("Product found.");
					   p.dispData();
				   }else {
					   System.out.println("Product not found.");
				   }
				   break;
				   
			case 6:
				   for(int i=0;i<list.size();i++) {
					   p = list.get(i);
					   p.dispData();
				   }
				   break;
				   
			case 7:
				   System.exit(0);
				   try {
						Thread.sleep(3000);
				   } catch (InterruptedException e) {
						e.printStackTrace();
				   }
				   break;
	
			
			}
		}while(choice != 7);
	}

}

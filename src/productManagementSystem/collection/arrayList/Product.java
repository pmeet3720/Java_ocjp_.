package productManagementSystem.collection.arrayList;

import java.util.Scanner;

public class Product {
	
	/*
	 *  Each product has:
		Product ID (int)
		Name (String)
		Category (String)
		Price (double)
		Quantity (int)
	 * 
	 * 
	 */
	
	private int prodId;
	private String name;
	private String category;
	private double price;
	private int quantity;
	
	public Product() {
		
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter prodID: ");
		prodId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter prod name: ");
		name = sc.nextLine();
		
		System.out.println("enter prod category: ");
		category = sc.nextLine();
		
		System.out.println("enter prod price: ");
		price = sc.nextDouble();
		
		System.out.println("enter prod quantity: ");
		quantity = sc.nextInt();
	}
	
	public void updateData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter prod name: ");
		name = sc.nextLine();
		
		System.out.println("enter prod category: ");
		category = sc.nextLine();
		
		System.out.println("enter prod price: ");
		price = sc.nextDouble();
		
		System.out.println("enter prod quantity: ");
		quantity = sc.nextInt();
	}
	
	public void dispData() {
		System.out.println(prodId+" "+name+" "+category+" "+price+" "+quantity);
	}

}

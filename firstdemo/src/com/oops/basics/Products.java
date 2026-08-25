package com.oops.basics;

public class Products {
	String[] showProducts() {
		// String[] products = new String[] {"Laptop","Mouse","Mobile", "Pen"};
		return new String[] {"Laptop","Mouse","Mobile", "Pen"};
	}
	
	void printCategories(String[] categories) {
		//iterate the array using for each and print it
		 for (String cat : categories) {
			System.out.println(cat);
		}
	}
	
	String offerDetails() {
		return "Onam offers available";
	}
	
	public static void main(String[] args) {
		Products product = new Products();
		String offers = product.offerDetails();
		System.out.println(offers);
		
		String[] all = product.showProducts();
		for(String prod:all)
			System.out.println(prod);
		
		String[] categories = new String[] {"Electronics", "Books", "Toys"};
		product.printCategories(categories);
		
	}

}

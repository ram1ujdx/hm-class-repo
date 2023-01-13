package com.hm.bookstore;

public class BookStoreImpl {

	public static void main(String[] args) {

		Book b1 = new Book(100101, "Programming in Java", "Adam", "Technology", 580);
		Book b2 = new Book(100102, "Data Structures and Algorithm", "John", "Technology", 2180);
		Book b3 = new Book(100103, "Networking", "Steve", "Technology", 2345);

		BookStore bookStrore = null;

		Book[] books = { b1, b2, b3 };
		if (bookStrore != null) {
			bookStrore.setBookStoreId("bs101");
			bookStrore.setBookStoreName("Xyz Store");
			bookStrore.setBooks(books);
		}

		System.out.println("Before Discount : ");
		for (Book b : bookStrore.getBooks()) {
			System.out.println(b);
		}

		for (Book b : bookStrore.getBooks()) {
			if (b.getGenre().equals("Fiction"))
				bookStrore.calculateDiscount(b, 25);
		}

		System.out.println("After Discount : ");
		for (Book b : bookStrore.getBooks()) {
			System.out.println(b);
		}

	}

}

package com.hm.bookstore;

public class BookStore {

	
	private String bookStoreName;
    private String bookStoreId;
    private Book[] books;
    
    public BookStore() {
		// TODO Auto-generated constructor stub
	}

	public BookStore(String bookStoreName, String bookStoreId, Book[] books) {
		super();
		this.bookStoreName = bookStoreName;
		this.bookStoreId = bookStoreId;
		this.books = books;
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public String getBookStoreId() {
		return bookStoreId;
	}

	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
    
	public float calculateDiscount(Book book,float discountPercentage)
    {
		
		float price = book.getPrice();
		float discount = price*(discountPercentage/100);
		float discountedPrice = price - discount;
		book.setPrice(discountedPrice);
		return discount;
  
    }


	
}

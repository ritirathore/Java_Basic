package com.wiley.bookpub.model;

public class Skillstore {
	int id;
	
	String bookname;
	String author;
	int isbn;
	int edition;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public Skillstore(int id, String bookname, String author, int isbn, int edition) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.isbn = isbn;
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "Skillstore [id=" + id + ", bookname=" + bookname + ", author=" + author + ", isbn=" + isbn
				+ ", edition=" + edition + "]";
	}
	
	
	

}

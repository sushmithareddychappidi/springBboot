package com;

public class Book 
{
	private String bookTitle;
	private String author;
	private int bookCost;
	private int noOfPages;
	public Book()
	{
		
	}
	public Book(String bookTitle, String author, int bookCost, int noOfPages) 
	{
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookCost = bookCost;
		this.noOfPages = noOfPages;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setBookCost(int bookCost)
	{
		this.bookCost=bookCost;
	}
	public int getBookCost()
	{
		return bookCost;
	}
	public void setnoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	public int getnoOfPages()
	{
		return noOfPages;
	}
	public void display()
	{
		System.out.println("BookTitle: "+getBookTitle());
		System.out.println("BookAuthor: "+getAuthor());
		System.out.println("BookCost: "+getBookCost());
		System.out.println("BookNoOfPages: "+getnoOfPages());
	}
	
	public String toString()
	{
		return "\n Book Title: "+getBookTitle()+
				"\n Author: "+getAuthor()+
				"\n Cost: "+getBookCost()+
				"\n No of Pages: "+getnoOfPages()+
				"\n --------------------------";
	}
	
}

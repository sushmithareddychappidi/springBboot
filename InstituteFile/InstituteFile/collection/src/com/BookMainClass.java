package com;

import java.util.ArrayList;

public class BookMainClass 
{
	public static void main(String[] args) 
	{
		Book b=new Book("java","james",600,500);
		Book b1=new Book("sql","Efcodd",300,400);
		Book b2=new Book("reactjs","Ramesh",800,1000);
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(b);
		al.add(b1);
		al.add(b2);
		for(Book book:al)
		{
			if(book.getBookCost()>400)
			{
				System.out.println("Book Title: "+book.getBookTitle());
				System.out.println("Book Author: "+book.getAuthor());
			}
		}
		System.out.println("-------------------");
		for(Book book:al)
		{
			if(book.getAuthor().equalsIgnoreCase("james"))
			{
				book.display();
			}
		}
		System.out.println("-------------------");
		for(Book book:al)
		{
			if(book.getnoOfPages()>700)
			{
				book.setBookCost(1500);
				book.display();
			}
		}
		System.out.println("-------------------");
	}

}

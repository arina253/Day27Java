package one;

import one.PRACTICE.Book;

public class Library  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* You are designing a class called Book to represent books in a library.
		Each Book object should have the following attributes: title, author, and year. 
		Write a Java program that includes a Book class with a constructor to initialize these attributes.*/
		
		Book Story = new Book ("Harry Potter","JK Rowling",1980);
		
		Book Poem = new Book ("Sitarpan", "vedvyas", 1910);
		
		
		System.out.println(Story.title); 
		System.out.println(Story.author);
		System.out.println(Story.year);
		
		
		System.out.println( "Title : " + Poem.title); 
		System.out.println(Poem.author);
		System.out.println(Poem.year);
		

	}

}


class Book{
	String title;
	String author;
	int year;
	
	public Book ( String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
}

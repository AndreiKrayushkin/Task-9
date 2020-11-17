package by.andrei.task09.exer01;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> book;
	
	public Library() {
		book = new ArrayList<Book>();
	}
	
	public void add (Book f) {
		book.add(f);
	}
	
	public List<Book> getBooks() {
		return book;
	}
}

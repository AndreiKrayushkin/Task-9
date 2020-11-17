package by.andrei.task09.exer01;

import java.util.List;

public class BookViev {
	public void print (List<Book> list) {
		for (Book book : list) {
			System.out.println("Книга: " + book.getTitle() + ". Автор: " + book.getAuthor() + ". Издательство: " + book.getPublishingHouse() 
			+ ". Год выпуска: " + book.getYear() + ". Количество страниц: " + book.getPages() + ". Стоимость: " + book.getPrice() + ".");
		}
	}
}

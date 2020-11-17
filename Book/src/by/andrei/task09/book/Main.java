package by.andrei.task09.exer01;

public class Main {

	public static void main(String[] args) {
		Library book = new Library();
		
		book.add(new Book (1, "Учебный курс С++", "Франка", "Питер", 2010, 600, 50, "твердый"));
		book.add(new Book(2, "Самоучитель С++", "Шилтд", "Питер", 2002, 400, 30, "мягкий"));
		book.add(new Book(3, "Самоучитель С#", "Шарп", "Эксмо", 2014, 800, 80, "твердый"));
		
		System.out.println("Все книги:");
		BookViev vCustomer = new BookViev();
		vCustomer.print(book.getBooks());

		BookLogic cl = new BookLogic();
		System.out.println("\n" + "Книги автора " +  "Франка" + ":");
		vCustomer.print(cl.getAuthor("Франка", book.getBooks()));
		System.out.println("\n" + "Книги от издательства " + "Питер" + ":");
		vCustomer.print(cl.getPublishingHouse("Питер", book.getBooks()));
		System.out.println("\n" + "Книги, выпущенные после " + "2005" + " года:");
		vCustomer.print(cl.getDate(2005, book.getBooks()));

	}
}

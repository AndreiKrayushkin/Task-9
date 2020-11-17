package by.andrei.task09.exer01;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
	
	public  List<Book> getAuthor (String setAuthor, List<Book> a) {
		List <Book> resultat = new ArrayList<Book>();
		for (Book account : a) {
			if (account.getAuthor() == setAuthor) {
				resultat.add(account);
			}						
		}
		return resultat;
	}
	
	public  List<Book> getPublishingHouse (String setPublishingHouse, List<Book> a) {
		List <Book> resultat = new ArrayList<Book>();
		for (Book account : a) {
			if (account.getPublishingHouse() == setPublishingHouse) {
				resultat.add(account);
			}						
		}
		return resultat;
	}
	
	public  List<Book> getDate (int setDate, List<Book> a) {
		List <Book> resultat = new ArrayList<Book>();
		for (Book account : a) {
			if (account.getYear() > setDate) {
				resultat.add(account);
			}						
		}
		return resultat;
	}
}
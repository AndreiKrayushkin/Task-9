package by.andrei.task09.exer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <Customer> bank = new ArrayList<Customer>();

		bank.add(new Customer (1, "Краюшкин", "Андрей", "Сергеевич", "Минск", 25555555, 213));
		bank.add(new Customer(2, "Карнаух", "Дарья", "Михайловна", "Витебск", 34444444, 213));
		bank.add(new Customer(3, "Кирвель", "Андрей", "Игоревич", "Могилев", 23333333, 213));
		bank.add(new Customer (1, "Краюшкин", "Евгений", "Андреевич", "Минск", 25555555, 213));
		bank.add(new Customer(4, "Бордак", "Анастасия", "Андреевна", "Минск", 33333333, 213));
		bank.add(new Customer(5, "Латышев", "Максим", "Павлович", "Брест", 10000000, 213));
		bank.add(new Customer(6, "Бондарь", "Владислав", "Эдуардович", "Витебск", 45555555, 213));
		
		System.out.println("До сортировки:");
		CustomerViev view = new CustomerViev();
		
		view.print(bank);
		
		Collections.sort(bank);
		 
		System.out.println("\nПосле сортировки");
		view.print(bank);
		
		System.out.println("\nПокупатели, у которых номера ккарточек между 20000000 и 30000000");	
		CustomerLogic cl = new CustomerLogic();
		view.print(cl.filter(20000000, 30000000, bank));
	}
}

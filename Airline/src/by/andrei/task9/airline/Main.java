//Создать класс Airline, спецификация которого приведена ниже. 
//Определить конструкторы, set- и get- методы и метод toString(). 
//Создать второй класс, агрегирующий массив типа Airline, 
//с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, 
//время вылета для которых больше заданного


package by.andrei.task9.airline;

public class Main {

	public static void main(String[] args) {
		AirLineAgregator airLine = new AirLineAgregator();
		airLine.add(new AirLine("Минск", 1995, "Пассажирский", 03, 23, "пятница"));
		airLine.add(new AirLine("Москва", 3569, "Пассажирский", 11, 11, "вторник"));
		airLine.add(new AirLine("Москва", 3569, "Пассажирский", 02, 11, "вторник"));
		airLine.add(new AirLine("Москва", 3569, "Пассажирский", 3, 11, "вторник"));
		airLine.add(new AirLine("Киев", 4521, "Пассажирский", 22, 50, "среда"));
		
		AirLineLogic airLogic = new AirLineLogic();
		AirLineView view = new AirLineView();
		
		System.out.println("Все рейсы:");
		view.print(airLine.getAirLine());
		
		System.out.println("\n" + "Рейсы, у которых пункт назначения - " + "Минск" + ":");
		view.print(airLogic.searchDestination(airLine.getAirLine(), "Минск"));
		
		System.out.println("\n" + "Рейсы, которые вылетают в день недели - " + "вторник" + ":");
		view.print(airLogic.searchDayOfWeek(airLine.getAirLine(), "вторник"));
		
		System.out.println("\n" + "Рейсы, которые вылетают в день недели - " + "вторник" + ", после " + "11:10" + ":");
		view.print(airLogic.searchDayOfWeekForTime(airLine.getAirLine(), "вторник", 11, 10));
	}

}

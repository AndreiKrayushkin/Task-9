package by.andrei.task9.airline;

import java.util.List;

public class AirLineView {
	public void print (List<AirLine> list) {
		for (AirLine line : list) {
			System.out.println("Направление рейса: " + line.getDestination() + ". Номер рейса: " + line.getFlightNumber() + ". Тип самолета: " + line.getTypeAircraft() 
			+ ". Время вылета: " + line.getHours() + ":" + line.getMinutes() + ". День недели: " + line.getDayOfWeek() + ".");
		}
	}
}

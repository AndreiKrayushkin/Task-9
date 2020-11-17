package by.andrei.task9.airline;

import java.util.ArrayList;
import java.util.List;

public class AirLineLogic {
	public List<AirLine> searchDestination (List<AirLine> al, String getDestinationSearch) {
		List<AirLine> airLine = new ArrayList<AirLine>();
		for(AirLine list : al) {
			if (list.getDestination() == getDestinationSearch) {
				airLine.add(list);
			}
		}
		return airLine;
	}
	
	public List<AirLine> searchDayOfWeek (List<AirLine> al, String getDayOfWeekSearch) {
		List<AirLine> airLine = new ArrayList<AirLine>();
		List<AirLine> s = null;
		for(AirLine list : al) {
			if (list.getDayOfWeek() == getDayOfWeekSearch) {
				airLine.add(list);
			}
		}
		s = airLine;

		return s;
	}
	
	public List<AirLine> searchDayOfWeekForTime (List<AirLine> al, String getDayOfWeekSearch, int getHour, int getMinutes) {
		List<AirLine> airLine = new ArrayList<AirLine>();
		List<AirLine> s = null;
		if(getHour >= 0 && getHour < 24 && getMinutes >= 0 && getMinutes < 60) {
			for(AirLine list : al) {
				if (list.getDayOfWeek() == getDayOfWeekSearch) {
					if(list.getHours() > getHour) {
						airLine.add(list);							
					} else if(list.getHours() == getHour) {
						if (list.getMinutes() > getMinutes) {
							airLine.add(list);	
						}
					}
				}
			}
			s = airLine;
		} else {
			System.out.println("Время введено неверно!");
		}
		return s;
	}
	
}

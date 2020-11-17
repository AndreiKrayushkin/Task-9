package by.andrei.task9.airline;

import java.util.ArrayList;
import java.util.List;

public class AirLineAgregator {
	private List<AirLine> airLine;
	
	public AirLineAgregator() {
		airLine = new ArrayList<AirLine>();
	}
	
	public void add(AirLine f) {
		airLine.add(f);
	}
	
	public List<AirLine> getAirLine() {
		return airLine;
	}
	
}
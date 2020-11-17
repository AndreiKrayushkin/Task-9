package by.andrei.task9.airline;

public class AirLine {
	private String destination;
	private int flightNumber;
	private String typeAircraft;
	private int hours;
	private int minutes;
	private String dayOfWeek;
	
	public AirLine() {}
	public AirLine(String destination, int flightNumber, String typeAircraft, int hours, int minutes, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeAircraft = typeAircraft;
		this.hours = hours;
		this.minutes = minutes;
		this.dayOfWeek = dayOfWeek;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getTypeAircraft() {
		return typeAircraft;
	}
	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	@Override
	public String toString() {
		return "\n" + "AirLine [destination=" + destination + ", flightNumber=" + flightNumber + ", typeAircraft="
				+ typeAircraft + ", hours=" + hours + ", minutes=" + minutes + ", dayOfWeek=" + dayOfWeek + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + ((typeAircraft == null) ? 0 : typeAircraft.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirLine other = (AirLine) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (typeAircraft == null) {
			if (other.typeAircraft != null)
				return false;
		} else if (!typeAircraft.equals(other.typeAircraft))
			return false;
		return true;
	}
	
}

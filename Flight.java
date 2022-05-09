import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="flight_info")
public class Flight {
	@Id
	@GeneratedValue
	private int flightNumber;
	
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private float flighTicketcost;
	private int numberOfPassenger;
	private LocalDateTime flightDepartureFromSource;
	private LocalDateTime flightArrivalAtDestination;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public float getFlighTicketcost() {
		return flighTicketcost;
	}
	public void setFlighTicketcost(float flighTicketcost) {
		this.flighTicketcost = flighTicketcost;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public LocalDateTime getFlightDepartureFromSource() {
		return flightDepartureFromSource;
	}
	public void setFlightDepartureFromSource(LocalDateTime flightDepartureFromSource) {
		this.flightDepartureFromSource = flightDepartureFromSource;
	}
	public LocalDateTime getFlightArrivalAtDestination() {
		return flightArrivalAtDestination;
	}
	public void setFlightArrivalAtDestination(LocalDateTime flightArrivalAtDestination) {
		this.flightArrivalAtDestination = flightArrivalAtDestination;
	}
		
	
	

}

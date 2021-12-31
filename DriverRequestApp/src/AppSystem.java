import java.util.ArrayList;

public class AppSystem {	
	private ArrayList<Ride> requestedRides;
	private ArrayList<Driver> drivers;
	private ArrayList<Rider> riders;
	private User currentUser;
	//constructor
	public AppSystem() {
		this.requestedRides = new ArrayList<>();
		this.drivers = new ArrayList<>();
		this.riders = new ArrayList<>();
	}
	
	
	//setters and getters
	public ArrayList<Ride> getRequestedRides() {
		return requestedRides;
	}
	
	public void setRequestedRides(ArrayList<Ride> requestedRides) {
		this.requestedRides = requestedRides;
	}
	public ArrayList<Driver> getDrivers() {
		return drivers;
	}
	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}
	public ArrayList<Rider> getRiders() {
		return riders;
	}
	public void setRiders(ArrayList<Rider> riders) {
		this.riders = riders;
	}


	public User getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	
}

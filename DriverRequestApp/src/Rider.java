
public class Rider extends User {

	public Rider(String userName, String mobNum, String email, String password) {
		super(userName, mobNum, email, password);
	}
	
	public void RequestRide() {
		String source;
		String destination;
		System.out.println("enter your pick up location");
		source=sc.nextLine();
		System.out.println("enter your destination");
		destination=sc.nextLine();
		Ride newRide = new Ride(source, destination);
		
	}

	
}

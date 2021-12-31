
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
		Ride newRide = new Ride(source, destination ); //cost
		
	}
	public void rateRide() {
		System.out.println("PLease enter the number of the ride that you want to rate: ");
		for (int i = 0; i < this.getRideshistory().size(); i++) {
			Ride temp=this.getRideshistory().get(i);
			System.out.println((i+1)+") Title: " + temp.getTitle() + ", Source: " + temp.getSource() + ", Destination: " + temp.getDestinaion() + ", Rating: " + temp.getRating());	
		}
		int rideNum = sc.nextInt();
		if (this.getRideshistory().get(rideNum-1).getRating() == 0) {
			System.out.println("Please enter the rating of your ride: "); //1 to 5 stars
			int rating = sc.nextInt();
			this.getRideshistory().get(rideNum-1).setRating(rating);
		}else {
			System.out.println("This ride already has a rating, please try again... ");
		}
	}
	public void notifyUser() {
		System.out.println("");
	}
	
}

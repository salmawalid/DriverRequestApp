import java.util.Iterator;

public class Rider extends User {

	public Rider(String userName, String mobNum, String email, String password) {
		super(userName, mobNum, email, password);
	}
	
	
	//
	public static void register(AppSystem system) {
		String usernameTemp;
		String passwordTemp;
		String mobnumTemp;
		String emailTemp;
		
		
		
		System.out.println("please enter username:");
		usernameTemp=sc.nextLine();
		while(usernameTemp=="") {
			System.out.println("USERNAME CANT BE BLANK!...please enter username");
			usernameTemp=sc.nextLine();
		}
		
		System.out.println("please enter password:");
		passwordTemp=sc.nextLine();
		while(passwordTemp=="") {
			System.out.println("PASSWORD CANT BE BLANK!...please enter password");
			passwordTemp=sc.nextLine();
		}
		
		System.out.println("please enter mobile number:");
		mobnumTemp=sc.nextLine();
		while(mobnumTemp=="") {
			System.out.println("MOBILE NUMBER CANT BE BLANK!...please enter mobile number");
			mobnumTemp=sc.nextLine();
		}
		
		System.out.println("please enter email (optional)");
		emailTemp=sc.nextLine();
		
		Rider tempRider = new Rider(usernameTemp,mobnumTemp,emailTemp,passwordTemp); 
		system.getRiders().add(tempRider);
		
	}
	
	public static void login(AppSystem system) {
		String usernameTemp;
		String passwordTemp;
		
		System.out.println("please enter username:");
		usernameTemp=sc.nextLine();
		while(usernameTemp=="") {
			System.out.println("USERNAME CANT BE BLANK!...please enter username");
			usernameTemp=sc.nextLine();
		}
		
		System.out.println("please enter password:");
		passwordTemp=sc.nextLine();
		while(passwordTemp=="") {
			System.out.println("PASSWORD CANT BE BLANK!...please enter password");
			passwordTemp=sc.nextLine();
		}
		
		for (int i = 0; i < system.getRiders().size(); i++) {
			if (system.getRiders().get(i).getUserName()==usernameTemp && system.getRiders().get(i).getPassword()==passwordTemp) {
				system.setCurrentUser(system.getRiders().get(i));
				System.out.println("login successful!");
				return;
			}
		}
		System.out.println("user doesnt exist! \n type (1) to register or (2) to try logging in again ");
		int choice = sc.nextInt();
		if(choice == 1) {
			Rider.register(system);
		}else if (choice == 2) {
			Rider.login(system);
		}else {
			System.out.println("please enter a valid choice!");
		}
	}
	
	public void RequestRide(AppSystem system) {
		String source;
		String destination;
		System.out.println("enter your pick up location");
		source=sc.nextLine();
		System.out.println("enter your destination");
		destination=sc.nextLine();
		Ride newRide = new Ride(source, destination,this );
		system.getRequestedRides().add(newRide);
		
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
	public void notifyUserPrice() {
		System.out.println("");
	}
	
	
	
}

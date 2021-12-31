import java.util.ArrayList;
import java.util.Scanner;

public class Driver extends User {

	private String drivingLicense;
	private String nationalID;
	private ArrayList<String> favoriteAreas;
	private boolean verified;
	private double balance;
	private Ride currentRide;

	Scanner scanner = new Scanner(System.in);

	public Driver(String userName, String mobNum, String email, String password, String drivingLicense,
			String nationalID) {
		super(userName, mobNum, email, password);
		this.drivingLicense = drivingLicense;
		this.nationalID = nationalID;
		this.favoriteAreas = new ArrayList<>();
		this.verified = false;
		this.balance = 0;
	}

	// methods

	public static void register(AppSystem system) {
		
		String usernameTemp;
		String mobnumTemp;
		String emailTemp;
		String passwordTemp;
		String drivinglicenseTempString;
		String nationalIDTemp;
		
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
		
		System.out.println("please enter national ID:");
		nationalIDTemp = sc.nextLine();
		while (nationalIDTemp == "") {
			System.out.println("NATIONAL ID CANT BE BLANK!...please enter national ID");
			nationalIDTemp = sc.nextLine();
		}

		System.out.println("please enter driving License:");
		drivinglicenseTempString = sc.nextLine();
		while (drivinglicenseTempString == "") {
			System.out.println("driving License CANT BE BLANK!...please enter driving license");
			drivinglicenseTempString = sc.nextLine();
		}
		
		Driver tempDriver = new Driver(usernameTemp, mobnumTemp, emailTemp, passwordTemp, drivinglicenseTempString, nationalIDTemp);
		system.getDrivers().add(tempDriver);
		system.setCurrentUser(tempDriver);

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
		
		for (int i = 0; i < system.getDrivers().size(); i++) {
			if (system.getDrivers().get(i).getUserName()==usernameTemp && system.getDrivers().get(i).getPassword()==passwordTemp) {
				system.setCurrentUser(system.getDrivers().get(i));
				System.out.println("login successful!");
				return;
			}
		}
		System.out.println("user doesnt exist! \n type (1) to register or (2) to try logging in again ");
		int choice = sc.nextInt();
		if(choice == 1) {
			Driver.register(system);
		}else if (choice == 2) {
			Driver.login(system);
		}else {
			System.out.println("please enter a valid choice!");
		}
	}
	
	

	public void endRide() {
		this.getRideshistory().add(this.currentRide);
		this.balance += this.currentRide.getCost();
		this.currentRide = null;
	}
	
	
	public void suggestPrice() {
		
	}




	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public Ride getCurrentRide() {
		return currentRide;
	}

	public void setCurrentRide(Ride currentRide) {
		this.currentRide = currentRide;
	}

	public ArrayList<String> getFavoriteAreas() {
		return favoriteAreas;
	}

	public void setFavoriteAreas(ArrayList<String> favoriteAreas) {
		this.favoriteAreas = favoriteAreas;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	
	
	Scanner sc = new Scanner(System.in);

	
	private String userName;
	private String mobNum;
	private String email;
	private String password;
	private ArrayList<Ride> rideshistory; //both the rider and driver will have a ride history for the rides they've taken and given respectively
	
	
	//constructor
	public User(String userName, String mobNum, String email, String password) {
		this.userName = userName;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
		this.rideshistory = new ArrayList<>();
	}
	
	//methods
	
	/*user is prompted to enter their data and if they leave mandatory field blank they're prompted again
	with a warning message then later on this data should be entered into some database i guess*/
	public void register() {
		System.out.println("please enter username:");
		this.userName=sc.nextLine();
		while(this.userName=="") {
			System.out.println("USERNAME CANT BE BLANK!...please enter username");
			this.userName=sc.nextLine();
		}
		
		System.out.println("please enter password:");
		this.password=sc.nextLine();
		while(this.password=="") {
			System.out.println("PASSWORD CANT BE BLANK!...please enter password");
			this.password=sc.nextLine();
		}
		
		System.out.println("please enter mobile number:");
		this.mobNum=sc.nextLine();
		while(this.mobNum=="") {
			System.out.println("MOBILE NUMBER CANT BE BLANK!...please enter mobile number");
			this.mobNum=sc.nextLine();
		}
		
		System.out.println("please enter email (optional)");
		this.email=sc.nextLine();
		
	}
	public void login() {
		
	}
	
	public void RequestRide() {
		String source;
		String destination;
		System.out.println("enter your pick up location");
		source=sc.nextLine();
		System.out.println("enter your destination");
		destination=sc.nextLine();
		
		
	}
	
	
	
	//setters and getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ArrayList<Ride> getRideshistory() {
		return rideshistory;
	}


	public void setRideshistory(ArrayList<Ride> rideshistory) {
		this.rideshistory = rideshistory;
	}
	
}

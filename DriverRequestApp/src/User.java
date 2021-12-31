import java.util.ArrayList;
import java.util.Scanner;

public abstract class User {
	
	
	static Scanner sc = new Scanner(System.in);

	
	private String userName;
	private String mobNum;
	private String email;
	private String password;
	private ArrayList<Ride> rideshistory; //both the rider and driver will have a ride history for the rides they've taken and given respectively
	
	
	public User(String userName, String mobNum, String email, String password) {
		this.userName = userName;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
		this.rideshistory = new ArrayList<>();
	}
	
	//methods
	
	/*user is prompted to enter their data and if they leave mandatory field blank they're prompted again
	with a warning message then later on this data should be entered into some database */
	public static void register(AppSystem system) {
		
		
	}
	public static void login(AppSystem system) {
		
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

import java.util.ArrayList;
import java.util.Scanner;


public class Driver extends User {

	private String drivingLicense;
	private String nationalID;
	private ArrayList<String> favoriteAreas; 
	private boolean verified;
	
	Scanner scanner = new Scanner(System.in);
	
	


	public Driver(String userName, String mobNum, String email, String password, String drivingLicense, String nationalID) {
		super(userName, mobNum, email, password);
		this.drivingLicense = drivingLicense;
		this.nationalID = nationalID;
		this.favoriteAreas = new ArrayList<>();
		this.verified = false;
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


	public void register() {
		super.register();
		System.out.println("please enter national ID:");
		this.nationalID=sc.nextLine();
		while(this.nationalID=="") {
			System.out.println("NATIONAL ID CANT BE BLANK!...please enter national ID");
			this.nationalID=sc.nextLine();
		}
		
		System.out.println("please enter driving License:");
		this.drivingLicense=sc.nextLine();
		while(this.drivingLicense=="") {
			System.out.println("driving License CANT BE BLANK!...please enter driving license");
			this.drivingLicense=sc.nextLine();
		}
		
	}
	
	//scans all the currently requested rides and lists the ones with the same source as one of the driver's favorite areas(scans both arraylists against eachother) and create an offer but i dont know how to retireve the currently available rides
	public ArrayList<Ride> list(String source) {
		
		
	}
	
}
